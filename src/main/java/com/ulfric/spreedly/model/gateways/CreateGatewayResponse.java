package com.ulfric.spreedly.model.gateways;

import com.ulfric.spreedly.model.Response;

public class CreateGatewayResponse extends Response {

	private Gateway gateway;

	public Gateway getGateway() {
		return gateway;
	}

	public void setGateway(Gateway gateway) {
		this.gateway = gateway;
	}

}
