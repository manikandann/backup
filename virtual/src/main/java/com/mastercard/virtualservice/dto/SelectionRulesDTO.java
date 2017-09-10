package com.mastercard.virtualservice.dto;

import org.springframework.stereotype.Component;

@Component(value="selectionRules")
public class SelectionRulesDTO {
	private SelectionType selType;
	private String minItems;
	private String maxItems;
	
	public SelectionRulesDTO()
	{
		super();
	}
	
	public SelectionRulesDTO(SelectionType selType, String minItems, String maxItems) {
		super();
		this.selType = selType;
		this.minItems = minItems;
		this.maxItems = maxItems;
	}
	
	public void setSelectionType(SelectionType selType) {
		this.selType = selType;
	}
	public SelectionType getSelectionType() {
		return selType;
	}
	
	public void setMinimumItems(String minItems) {
		this.minItems = minItems;
	}
	public String getMinimumItems() {
		return minItems;
	}

	public void setMaximumItems(String maxItems) {
		this.maxItems = maxItems;
	}
	public String getMaximumItems() {
		return maxItems;
	}
}
