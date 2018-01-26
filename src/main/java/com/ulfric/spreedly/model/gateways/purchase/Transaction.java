package com.ulfric.spreedly.model.gateways.purchase;

import java.util.Currency;

import com.google.gson.annotations.SerializedName;

public class Transaction {

	@SerializedName("payment_method_token")
	private String paymentMethodToken;

	@SerializedName("currency_code")
	private Currency currency;

	@SerializedName("retain_on_success")
	private Boolean retain;

	@SerializedName("ip")
	private String ipAddress;

	private Long amount;
	private String description;
	private String email;

	public String getPaymentMethodToken() {
		return paymentMethodToken;
	}

	public void setPaymentMethodToken(String paymentMethodToken) {
		this.paymentMethodToken = paymentMethodToken;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Boolean getRetain() {
		return retain;
	}

	public void setRetain(Boolean retain) {
		this.retain = retain;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
