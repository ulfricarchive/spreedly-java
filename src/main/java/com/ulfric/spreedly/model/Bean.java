package com.ulfric.spreedly.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Bean {

	public static final Gson BEAN_GSON = new GsonBuilder().setPrettyPrinting().create();

	public String toJson() {
		return BEAN_GSON.toJson(this);
	}

}
