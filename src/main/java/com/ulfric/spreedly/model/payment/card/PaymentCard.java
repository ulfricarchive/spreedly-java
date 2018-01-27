package com.ulfric.spreedly.model.payment.card;

import com.google.gson.annotations.SerializedName;
import com.ulfric.spreedly.model.Bean;

public class PaymentCard extends Bean {

	private String month;
	private String year;

	@SerializedName("number")
	private String cardNumber;

	@SerializedName("verification_value")
	private String cvv;

	@SerializedName("full_name")
	private String fullName;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
