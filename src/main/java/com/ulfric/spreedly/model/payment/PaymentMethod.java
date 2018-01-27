package com.ulfric.spreedly.model.payment;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ulfric.spreedly.model.Bean;
import com.ulfric.spreedly.model.payment.card.CardType;

public class PaymentMethod extends Bean {

	private String token;
	private List<Error> errors;
	private Boolean test;
	private String email;
	private Integer month;
	private Integer year;
	private String fingerprint;
	private String number;

	@SerializedName("created_at")
	private String createdAt; // TODO use instant

	@SerializedName("updated_at")
	private String updatedAt; // TODO use instant

	@SerializedName("gateway_type")
	private String gatewayType; // TODO use gateway type enum

	@SerializedName("storage_state")
	private String storageState; // TODO enum

	@SerializedName("third_party_token")
	private String thirdPartyToken;

	@SerializedName("payment_method_type")
	private com.ulfric.spreedly.model.PaymentMethod paymentMethod;

	@SerializedName("eligible_for_card_updater")
	private Boolean eligibleForCardUpdater;

	@SerializedName("last_four_digits")
	private String lastFourDigits;

	@SerializedName("first_six_digits")
	private String firstSixDigits;

	@SerializedName("card_type")
	private CardType cardType;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("last_name")
	private String lastName;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	public Boolean getTest() {
		return test;
	}

	public void setTest(Boolean test) {
		this.test = test;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public String getGatewayType() {
		return gatewayType;
	}

	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

	public String getStorageState() {
		return storageState;
	}

	public void setStorageState(String storageState) {
		this.storageState = storageState;
	}

	public String getThirdPartyToken() {
		return thirdPartyToken;
	}

	public void setThirdPartyToken(String thirdPartyToken) {
		this.thirdPartyToken = thirdPartyToken;
	}

	public com.ulfric.spreedly.model.PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(com.ulfric.spreedly.model.PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Boolean getEligibleForCardUpdater() {
		return eligibleForCardUpdater;
	}

	public void setEligibleForCardUpdater(Boolean eligibleForCardUpdater) {
		this.eligibleForCardUpdater = eligibleForCardUpdater;
	}

	public String getLastFourDigits() {
		return lastFourDigits;
	}

	public void setLastFourDigits(String lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}

	public String getFirstSixDigits() {
		return firstSixDigits;
	}

	public void setFirstSixDigits(String firstSixDigits) {
		this.firstSixDigits = firstSixDigits;
	}

	public CardType getCardType() {
		return cardType;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
