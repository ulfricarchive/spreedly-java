package com.ulfric.spreedly.model.gateways.purchase;

import com.google.gson.annotations.SerializedName;
import com.ulfric.spreedly.model.Bean;

public class TransactionResponse extends Bean {

	private Boolean success;
	private String message;
	private Boolean pending;
	private Boolean cancelled;

	@SerializedName("avs_code")
	private String avsCode;

	@SerializedName("avs_message")
	private String avsMessage;

	@SerializedName("cvv_code")
	private String cvvCode;

	@SerializedName("cvv_message")
	private String cvvMessage;

	@SerializedName("result_unknown")
	private Boolean resultUnknown;

	@SerializedName("error_code")
	private String errorCode;

	@SerializedName("error_detail")
	private String errorDetail;

	// TODO fraud_review field

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getPending() {
		return pending;
	}

	public void setPending(Boolean pending) {
		this.pending = pending;
	}

	public Boolean getCancelled() {
		return cancelled;
	}

	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
	}

	public String getAvsCode() {
		return avsCode;
	}

	public void setAvsCode(String avsCode) {
		this.avsCode = avsCode;
	}

	public String getAvsMessage() {
		return avsMessage;
	}

	public void setAvsMessage(String avsMessage) {
		this.avsMessage = avsMessage;
	}

	public String getCvvCode() {
		return cvvCode;
	}

	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}

	public String getCvvMessage() {
		return cvvMessage;
	}

	public void setCvvMessage(String cvvMessage) {
		this.cvvMessage = cvvMessage;
	}

	public Boolean getResultUnknown() {
		return resultUnknown;
	}

	public void setResultUnknown(Boolean resultUnknown) {
		this.resultUnknown = resultUnknown;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDetail() {
		return errorDetail;
	}

	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}

}
