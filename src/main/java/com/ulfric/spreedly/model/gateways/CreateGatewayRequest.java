package com.ulfric.spreedly.model.gateways;

import com.google.gson.annotations.SerializedName;
import com.ulfric.spreedly.model.Request;

public class CreateGatewayRequest extends Request {

	@SerializedName("gateway_type")
	private String gatewayType;

	private String description;

	public String getGatewayType() {
		return gatewayType;
	}

	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
