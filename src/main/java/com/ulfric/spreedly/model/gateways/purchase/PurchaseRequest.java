package com.ulfric.spreedly.model.gateways.purchase;

import com.ulfric.spreedly.model.Request;

public class PurchaseRequest extends Request {

	private transient String gatewayToken;
	private Transaction transaction;

	public String getGatewayToken() {
		return gatewayToken;
	}

	public void setGatewayToken(String gatewayToken) {
		this.gatewayToken = gatewayToken;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

}
