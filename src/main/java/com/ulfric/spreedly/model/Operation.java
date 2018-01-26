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
	VERIFY,

	@SerializedName("general_credit")
    GENERAL_CREDIT,

	@SerializedName("reference_purchase")
	REFERENCE_PURCHASE,

	@SerializedName("purchase_via_preauthorization")
	PURCHASE_VIA_PREAUTHORIZATION,

	@SerializedName("offsite_purchase")
	OFFSITE_PURCHASE,

	@SerializedName("offsite_authorize")
	OFFSITE_AUTHORIZE,

	@SerializedName("3dsecure_purchase")
	THREE_D_SECURE_PURCHASE,

	@SerializedName("3dsecure_authorize")
	THREE_D_SECURE_AUTHORIZE,

	@SerializedName("store")
	STORE,

	@SerializedName("remove")
	REMOVE,

	@SerializedName("disburse")
	DISBURSE,

	@SerializedName("reference_authorization")
	REFERENCE_AUTHORIZATION;

}
