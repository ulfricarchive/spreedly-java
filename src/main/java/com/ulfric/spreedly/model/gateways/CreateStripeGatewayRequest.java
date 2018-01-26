package com.ulfric.spreedly.model.gateways;

public class CreateStripeGatewayRequest extends CreateGatewayRequest {

	private String login;

	public CreateStripeGatewayRequest() {
		setGatewayType("stripe");
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
