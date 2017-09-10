package com.mastercard.virtualservice.dto;

import org.springframework.stereotype.Component;

@Component
public class BenefitSelectionWindow {
	
private String startDate;

private String endDate;
private Boolean isDowngradeAllowed;
private Boolean  isEligible;

public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public boolean isDowngradeAllowed() {
	return isDowngradeAllowed;
}
public void setDowngradeAllowed(boolean isDowngradeAllowed) {
	this.isDowngradeAllowed = isDowngradeAllowed;
}
public boolean isEligible() {
	return isEligible;
}
public void setEligible(boolean isEligible) {
	this.isEligible = isEligible;
}	

public BenefitSelectionWindow() {
	super();
	// TODO Auto-generated constructor stub
}
public BenefitSelectionWindow(String startDate, String endDate, Boolean isDowngradeAllowed, Boolean isEligible) {
	super();
	this.startDate = startDate;
	this.endDate = endDate;
	this.isDowngradeAllowed = isDowngradeAllowed;
	this.isEligible = isEligible;
}
}
