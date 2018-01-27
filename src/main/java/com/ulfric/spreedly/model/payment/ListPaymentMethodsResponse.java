package com.ulfric.spreedly.model.payment;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ulfric.spreedly.model.Response;

public class ListPaymentMethodsResponse extends Response {

	@SerializedName("payment_methods")
	private List<PaymentMethod> paymentMethods;

	public List<PaymentMethod> getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

}
