package com.ulfric.spreedly.okhttp;

import java.io.IOException;

import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public class SimpleAuthenticator implements Authenticator {

	private final String username;
	private final String password;

	public SimpleAuthenticator(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public Request authenticate(Route route, Response response) throws IOException {
		if (isAuthenticationAttempted(response)) {
			return null;
		}

		return response.request().newBuilder()
				.header("Authorization", Credentials.basic(username, password))
				.build();
	}

	private boolean isAuthenticationAttempted(Response response) {
		return response.request().header("Authorization") != null;
	}

}
