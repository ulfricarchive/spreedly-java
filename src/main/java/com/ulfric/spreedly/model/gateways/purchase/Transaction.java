package com.ulfric.spreedly.model.gateways.purchase;

import java.util.Currency;
import java.util.Set;

import com.google.gson.annotations.SerializedName;
import com.ulfric.spreedly.model.Bean;
import com.ulfric.spreedly.model.payment.card.PaymentCard;

public class Transaction extends Bean {

	@SerializedName("payment_method_token")
	private String paymentMethodToken;

	@SerializedName("currency_code")
	private Currency currency;

	@SerializedName("retain_on_success")
	private Boolean retain;

	@SerializedName("ip")
	private String ipAddress;

	@SerializedName("credit_card")
	private PaymentCard card;

	@SerializedName("gateway_specific_fields")
	private Set<String> gatewaySpecificFields;

	@SerializedName("created_at")
	private String createdAt; // TODO use Instant

	@SerializedName("updated_at")
	private String updatedAt; // TODO use Instant

	@SerializedName("transaction_type")
	private String transactionType; // TODO use enum

	@SerializedName("order_id")
	private String orderId;

	@SerializedName("merchant_name_descriptor")
	private String merchantNameDescriptor;

	@SerializedName("merchant_location_descriptor")
	private String merchantLocationDescriptor;

	@SerializedName("gateway_transaction_id")
	private String gatewayTransactionId;

	@SerializedName("gateway_latency_ms")
	private Long gatewayLatencyMillis;

	@SerializedName("message_key")
	private String messageKey;

	@SerializedName("gateway_type")
	private String gatewayType; // TODO gatewayType enum

	private Long amount;
	private String description;
	private String email;
	private String message;
	private String token;
	private Boolean succeeded;
	private TransactionResponse response;

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

	public PaymentCard getCard() {
		return card;
	}

	public void setCard(PaymentCard card) {
		this.card = card;
	}

	public Set<String> getGatewaySpecificFields() {
		return gatewaySpecificFields;
	}

	public void setGatewaySpecificFields(Set<String> gatewaySpecificFields) {
		this.gatewaySpecificFields = gatewaySpecificFields;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getMerchantNameDescriptor() {
		return merchantNameDescriptor;
	}

	public void setMerchantNameDescriptor(String merchantNameDescriptor) {
		this.merchantNameDescriptor = merchantNameDescriptor;
	}

	public String getMerchantLocationDescriptor() {
		return merchantLocationDescriptor;
	}

	public void setMerchantLocationDescriptor(String merchantLocationDescriptor) {
		this.merchantLocationDescriptor = merchantLocationDescriptor;
	}

	public String getGatewayTransactionId() {
		return gatewayTransactionId;
	}

	public void setGatewayTransactionId(String gatewayTransactionId) {
		this.gatewayTransactionId = gatewayTransactionId;
	}

	public Long getGatewayLatencyMillis() {
		return gatewayLatencyMillis;
	}

	public void setGatewayLatencyMillis(Long gatewayLatencyMillis) {
		this.gatewayLatencyMillis = gatewayLatencyMillis;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public String getGatewayType() {
		return gatewayType;
	}

	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public TransactionResponse getResponse() {
		return response;
	}

	public void setResponse(TransactionResponse response) {
		this.response = response;
	}

}
