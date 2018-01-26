package com.ulfric.spreedly.model.gateways.purchase;

import com.google.gson.annotations.SerializedName;
import com.ulfric.spreedly.model.Request;

public class PurchaseRequest extends Request {

	@SerializedName("gateway_token")
	private String gatewayToken;

	public String getGatewayToken() {
		return gatewayToken;
	}

	public void setGatewayToken(String gatewayToken) {
		this.gatewayToken = gatewayToken;
	}

}
