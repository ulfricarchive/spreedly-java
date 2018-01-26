package com.ulfric.spreedly.model.gateways;

import java.util.List;

import com.ulfric.spreedly.model.Response;

public class GatewayOptionsResponse extends Response {

	private List<Gateway> gateways;

	public List<Gateway> getGateways() {
		return gateways;
	}

	public void setGateways(List<Gateway> gateways) {
		this.gateways = gateways;
	}

}
