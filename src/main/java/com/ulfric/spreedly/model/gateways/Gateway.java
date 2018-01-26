package com.ulfric.spreedly.model.gateways;

import java.util.List;
import java.util.Set;

import com.google.gson.annotations.SerializedName;
import com.ulfric.spreedly.model.Bean;
import com.ulfric.spreedly.model.Operation;
import com.ulfric.spreedly.model.PaymentMethod;
import com.ulfric.spreedly.model.payment.card.CardType;

public class Gateway extends Bean {

	private String name;
	private Set<Operation> characteristics;
	private Set<String> regions; // TODO use a Region enum
	private String homepage;

	@SerializedName("gateway_type")
	private String gatewayType;

	@SerializedName("auth_modes")
	private List<AuthMode> authModes;

	@SerializedName("payment_methods")
	private Set<PaymentMethod> paymentMethods;

	@SerializedName("gateway_specific_fields")
	private Set<String> gatewaySpecificFields;

	@SerializedName("supported_countries")
	private Set<String> supportedCountries; // TODO use a Country enum

	@SerializedName("supported_cardtypes")
	private Set<CardType> supportedCardtypes;

	@SerializedName("company_name")
	private String companyName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Operation> getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(Set<Operation> characteristics) {
		this.characteristics = characteristics;
	}

	public Set<String> getRegions() {
		return regions;
	}

	public void setRegions(Set<String> regions) {
		this.regions = regions;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getGatewayType() {
		return gatewayType;
	}

	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

	public List<AuthMode> getAuthModes() {
		return authModes;
	}

	public void setAuthModes(List<AuthMode> authModes) {
		this.authModes = authModes;
	}

	public Set<PaymentMethod> getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(Set<PaymentMethod> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

	public Set<String> getGatewaySpecificFields() {
		return gatewaySpecificFields;
	}

	public void setGatewaySpecificFields(Set<String> gatewaySpecificFields) {
		this.gatewaySpecificFields = gatewaySpecificFields;
	}

	public Set<String> getSupportedCountries() {
		return supportedCountries;
	}

	public void setSupportedCountries(Set<String> supportedCountries) {
		this.supportedCountries = supportedCountries;
	}

	public Set<CardType> getSupportedCardtypes() {
		return supportedCardtypes;
	}

	public void setSupportedCardtypes(Set<CardType> supportedCardtypes) {
		this.supportedCardtypes = supportedCardtypes;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
