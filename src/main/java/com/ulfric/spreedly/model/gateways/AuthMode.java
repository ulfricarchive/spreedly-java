package com.ulfric.spreedly.model.gateways;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ulfric.spreedly.model.Bean;

public class AuthMode extends Bean {

	private String name;
	private List<Credential> credentials;

	@SerializedName("auth_mode_type")
	private String authModeType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Credential> getCredentials() {
		return credentials;
	}

	public void setCredentials(List<Credential> credentials) {
		this.credentials = credentials;
	}

	public String getAuthModeType() {
		return authModeType;
	}

	public void setAuthModeType(String authModeType) {
		this.authModeType = authModeType;
	}

}
