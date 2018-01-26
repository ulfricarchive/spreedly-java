package com.ulfric.spreedly.model;

import com.google.gson.annotations.SerializedName;

public enum Operation {

	@SerializedName("purchase")
	PURCHASE,

	@SerializedName("authorize")
	AUTHORIZE,

	@SerializedName("capture")
	CAPTURE,

	@SerializedName("credit")
	CREDIT,

	@SerializedName("void")
	VOID,

	@SerializedName("verify")
    VERIFY;

}
