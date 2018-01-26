package com.ulfric.spreedly.model.gateways;

import com.google.gson.annotations.SerializedName;
import com.ulfric.spreedly.model.Request;

public class CreateGatewayRequest extends Request {

	@SerializedName("gateway_type")
	private String gatewayType;

	public String getGatewayType() {
		return gatewayType;
	}

	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

}
