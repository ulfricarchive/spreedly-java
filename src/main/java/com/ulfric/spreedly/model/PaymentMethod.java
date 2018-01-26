package com.ulfric.spreedly.model;

import com.google.gson.annotations.SerializedName;

public enum PaymentMethod {

	@SerializedName("credit_card")
	CREDIT_CARD,

	@SerializedName("sprel")
	SPREL,

	@SerializedName("bank_account")
	BANK,

	@SerializedName("third_party_token")
	THIRD_PARTY,

	@SerializedName("apple_pay")
	APPLE_PAY,

	@SerializedName("android_pay")
	ANDROID_PAY;

}
