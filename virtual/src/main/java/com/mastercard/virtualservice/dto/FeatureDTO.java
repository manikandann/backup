package com.mastercard.virtualservice.dto;

import org.springframework.stereotype.Component;

@Component(value="features")
public class FeatureDTO {
	private String name;
	private String description;
	private String dispOrder;
	
	public FeatureDTO()
	{
		super();
	}
	
	public FeatureDTO(String name, String description, String dispOrder) {
		super();
		this.name = name;
		this.description = description;
		this.dispOrder = dispOrder;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}

	public void setDisplayOrder(String dispOrder) {
		this.dispOrder = dispOrder;
	}
	public String getDisplayOrder() {
		return dispOrder;
	}
}
