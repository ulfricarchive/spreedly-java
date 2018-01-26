package com.ulfric.spreedly.model.gateways;

import com.ulfric.spreedly.model.Bean;

public class Credential extends Bean {

	private String name;
	private String label;
	private Boolean safe;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Boolean getSafe() {
		return safe;
	}

	public void setSafe(Boolean safe) {
		this.safe = safe;
	}

}
