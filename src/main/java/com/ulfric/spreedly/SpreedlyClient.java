package com.ulfric.spreedly;

import java.io.IOException;

import com.google.gson.Gson;
import com.ulfric.spreedly.exception.SpreedlyRuntimeException;
import com.ulfric.spreedly.model.gateways.GatewayOptionsResponse;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SpreedlyClient {

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private OkHttpClient okHttp;
		private String version;
		private Gson gson;

		Builder() {
		}

		public SpreedlyClient build() {
			OkHttpClient okHttp = this.okHttp == null ? new OkHttpClient() : this.okHttp;
			String version = this.version == null ? "v1" : this.version;
			Gson gson = this.gson == null ? new Gson() : this.gson;
			return new SpreedlyClient(okHttp, version, gson);
		}
	}

	private final OkHttpClient okHttp;
	private final String url;
	private final Gson gson;

	private SpreedlyClient(OkHttpClient okHttp, String version, Gson gson) {
		this.okHttp = okHttp;
		this.url = "https://core.spreedly.com/" + version;
		this.gson = gson;
	}

	public GatewayOptionsResponse listSupportedGateways() {
		return get(null, "gateways_options", GatewayOptionsResponse.class);
	}

	public <T extends com.ulfric.spreedly.model.Response> T get(com.ulfric.spreedly.model.Request request, String endpoint, Class<T> responseType) {
		String url = url(endpoint);

		Request okRequest;

		if (request == null) {
			okRequest = new Request.Builder()
				.get()
				.url(url)
				.build();
		} else {
			okRequest = null;
			// TODO
		}

		return call(okRequest, responseType);
	}

	private String url(String endpoint) {
		endpoint = endpoint + ".json";
		endpoint = endpoint.startsWith("/") ? endpoint : "/" + endpoint;
		return url + endpoint;
	}

	private <T extends com.ulfric.spreedly.model.Response> T call(Request request, Class<T> responseType) {
		try {
			Response response = okHttp.newCall(request).execute();
			String responseBody = response.body().string();
			System.out.println(responseBody);
			return gson.fromJson(responseBody, responseType);
		} catch (IOException exception) {
			throw new SpreedlyRuntimeException(exception);
		}
	}

}