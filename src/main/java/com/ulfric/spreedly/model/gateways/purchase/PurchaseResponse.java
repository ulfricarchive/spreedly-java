package com.ulfric.spreedly.model.gateways.purchase;

import com.ulfric.spreedly.model.Response;

public class PurchaseResponse extends Response {

	private Transaction transaction;

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

}
