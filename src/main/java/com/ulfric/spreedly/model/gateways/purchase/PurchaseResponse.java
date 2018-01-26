package com.ulfric.spreedly.model.gateways.purchase;

import com.google.gson.annotations.SerializedName;
import com.ulfric.spreedly.model.Response;

public class PurchaseResponse extends Response {

	private String token;
	private Boolean succeeded;
	private String message;
	private String response;

	@SerializedName("gateway_transaction_id")
	private String gatewayTransactionId;

	@SerializedName("retain_on_success")
	private Boolean retained;

	@SerializedName("payment_method_added")
	private Boolean paymentMethodAdded;

	@SerializedName("payment_method")
	private String paymentMethod;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Boolean getSucceeded() {
		return succeeded;
	}

	public void setSucceeded(Boolean succeeded) {
		this.succeeded = succeeded;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getGatewayTransactionId() {
		return gatewayTransactionId;
	}

	public void setGatewayTransactionId(String gatewayTransactionId) {
		this.gatewayTransactionId = gatewayTransactionId;
	}

	public Boolean getRetained() {
		return retained;
	}

	public void setRetained(Boolean retained) {
		this.retained = retained;
	}

	public Boolean getPaymentMethodAdded() {
		return paymentMethodAdded;
	}

	public void setPaymentMethodAdded(Boolean paymentMethodAdded) {
		this.paymentMethodAdded = paymentMethodAdded;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
