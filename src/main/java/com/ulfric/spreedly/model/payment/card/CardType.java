package com.ulfric.spreedly.model.payment.card;

import com.google.gson.annotations.SerializedName;

public enum CardType {

	@SerializedName("visa")
	VISA,

	@SerializedName("master")
	MASTERCARD,

	@SerializedName("american_express")
	AMERICAN_EXPRESS,

	@SerializedName("diners_club")
	DINERS_CLUB,

	@SerializedName("discover")
	DISCOVER,

	@SerializedName("jcb")
	JCB,

	@SerializedName("maestro")
	MAESTRO,

	@SerializedName("dankort")
	DANKORT;

}
