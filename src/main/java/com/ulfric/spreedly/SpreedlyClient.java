package com.ulfric.spreedly;

import java.io.IOException;
import java.util.Map;

import com.google.gson.Gson;
import com.ulfric.spreedly.exception.SpreedlyRuntimeException;
import com.ulfric.spreedly.model.gateways.GatewayOptionsResponse;
import com.ulfric.spreedly.model.gateways.purchase.PurchaseRequest;
import com.ulfric.spreedly.model.gateways.purchase.PurchaseResponse;

import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SpreedlyClient {

	private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private OkHttpClient okHttp;
		private String version;
		private Gson gson;
		private String environmentKey;
		private String secret;

		Builder() {
		}

		public SpreedlyClient build() {
			OkHttpClient okHttp = this.okHttp == null ? new OkHttpClient() : this.okHttp;
			String version = this.version == null ? "v1" : this.version;
			Gson gson = this.gson == null ? new Gson() : this.gson;
			return new SpreedlyClient(okHttp, version, gson, environmentKey, secret);
		}

		public Builder okHttp(OkHttpClient okHttp) {
			this.okHttp = okHttp;
			return this;
		}

		public Builder version(String version) {
			this.version = version;
			return this;
		}

		public Builder gson(Gson gson) {
			this.gson = gson;
			return this;
		}

		public Builder environmentKey(String environmentKey) {
			this.environmentKey = environmentKey;
			return this;
		}

		public Builder secret(String secret) {
			this.secret = secret;
			return this;
		}
	}

	private final OkHttpClient okHttp;
	private final Gson gson;
	private final String version;
	private final String environmentKey;
	private final String secret;

	private SpreedlyClient(OkHttpClient okHttp, String version, Gson gson, String environmentKey, String secret) {
		this.okHttp = okHttp;
		this.version = version;
		this.gson = gson;
		this.environmentKey = environmentKey;
		this.secret = secret;
	}

	public GatewayOptionsResponse listSupportedGateways() {
		return get(null, "gateways_options", GatewayOptionsResponse.class);
	}

	public PurchaseResponse purchase(PurchaseRequest request) {
		Parameters parameters = new Parameters();
		parameters.put("gateway_token", request.getGatewayToken());
		return post(request, "gateways/${gateway_token}/purchase", parameters, PurchaseResponse.class);
	}

	public <T extends com.ulfric.spreedly.model.Response> T get(com.ulfric.spreedly.model.Request request, String endpoint, Class<T> responseType) {
		HttpUrl url = url(endpoint, requestToParameters(request));

		Request okRequest = new Request.Builder().get().url(url).build();

		return call(okRequest, responseType);
	}

	public <T extends com.ulfric.spreedly.model.Response> T post(com.ulfric.spreedly.model.Request request,
			String endpoint, Parameters parameters, Class<T> responseType) {
		HttpUrl url = url(endpoint, parameters);

		Request okRequest = new Request.Builder().post(RequestBody.create(JSON, gson.toJson(request))).url(url).build();

		return call(okRequest, responseType);
	}

	private Parameters requestToParameters(com.ulfric.spreedly.model.Request request) {
		if (request == null) {
			return null;
		}

		return gson.fromJson(gson.toJson(request), Parameters.class);
	}

	private HttpUrl url(String endpoint, Parameters parameters) {
		endpoint = endpoint + ".json";
		endpoint = endpoint.startsWith("/") ? endpoint.substring(1) : endpoint;

		HttpUrl.Builder builder = new HttpUrl.Builder()
			.scheme("https")
			.host("core.spreedly.com")
			.addPathSegment(version)
			.username(environmentKey)
			.password(secret);

		if (parameters != null) {
			for (Map.Entry<String, String> parameter : parameters.entrySet()) {
				endpoint = endpoint.replace("${key}".replace("key", parameter.getKey()), parameter.getValue());

				builder = builder.addQueryParameter(parameter.getKey(), parameter.getValue());
			}
		}

		builder = builder.addPathSegments(endpoint);

		return builder.build();
	}

	private <T extends com.ulfric.spreedly.model.Response> T call(Request request, Class<T> responseType) {
		try {
			Response response = okHttp.newCall(request).execute();
			String responseBody = response.body().string();
			return gson.fromJson(responseBody, responseType);
		} catch (IOException exception) {
			throw new SpreedlyRuntimeException(exception);
		}
	}

}
