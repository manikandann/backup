package com.mastercard.virtualservice.dto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component(value="benefitSelection")
public class BenefitSelectionDTO {
	private String downgradeAllowed;
	private String eligible;
	private String endDate;
	private String startDate;
	public String getDowngradeAllowed() {
		return downgradeAllowed;
	}
	public void setDowngradeAllowed(String downgradeAllowed) {
		this.downgradeAllowed = downgradeAllowed;
	}
	public String getEligible() {
		return eligible;
	}
	public void setEligible(String eligible) {
		this.eligible = eligible;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	
	public List<BenefitSelectionDTO> addBundles(List<BenefitSelectionDTO> listOfBenefitsSelection, BenefitSelectionDTO benefitSelection)
	{
		listOfBenefitsSelection.add(benefitSelection);
		return listOfBenefitsSelection;
	}
}
