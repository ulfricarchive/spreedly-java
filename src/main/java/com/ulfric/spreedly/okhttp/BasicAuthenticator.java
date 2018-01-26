package com.ulfric.spreedly.okhttp;

import java.io.IOException;

import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public class BasicAuthenticator implements Authenticator {

	private final String credential;

	public BasicAuthenticator(String username, String password) {
		this.credential = Credentials.basic(username, password);
	}

	@Override
	public Request authenticate(Route route, Response response) throws IOException {
		return response.request().newBuilder().header("Authorization", credential).build();
	}

}
