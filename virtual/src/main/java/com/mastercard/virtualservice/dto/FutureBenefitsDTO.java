package com.mastercard.virtualservice.dto;


import org.springframework.stereotype.Component;

@Component(value="futureBenefits")
public class FutureBenefitsDTO {
	
	private String benefitId;
	private String benefitDisplayName;
	private String activationDate;
	private String endDate;
	private String benefitAttribute;
	private String imageUrl;
	private  Double price;
	private Double insurancePremiumPrice;
	private Double insuranceTaxPercent;
	private  String billingPeriod;
	private Boolean isEligible;
	
	public FutureBenefitsDTO(String benefitId, String benefitDisplayName, String activationDate, String endDate,
			String benefitAttribute, String imageUrl, Double price, Double insurancePremiumPrice,
			Double insuranceTaxPercent, String billingPeriod, Boolean isEligible) {
		super();
		this.benefitId = benefitId;
		this.benefitDisplayName = benefitDisplayName;
		this.activationDate = activationDate;
		this.endDate = endDate;
		this.benefitAttribute = benefitAttribute;
		this.imageUrl = imageUrl;
		this.price = price;
		this.insurancePremiumPrice = insurancePremiumPrice;
		this.insuranceTaxPercent = insuranceTaxPercent;
		this.billingPeriod = billingPeriod;
		this.isEligible = isEligible;
	}
	public FutureBenefitsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBenefitId() {
		return benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitDisplayName() {
		return benefitDisplayName;
	}
	public void setBenefitDisplayName(String benefitDisplayName) {
		this.benefitDisplayName = benefitDisplayName;
	}
	public String getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getBenefitAttribute() {
		return benefitAttribute;
	}
	public void setBenefitAttribute(String benefitAttribute) {
		this.benefitAttribute = benefitAttribute;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getInsurancePremiumPrice() {
		return insurancePremiumPrice;
	}
	public void setInsurancePremiumPrice(Double insurancePremiumPrice) {
		this.insurancePremiumPrice = insurancePremiumPrice;
	}
	public Double getInsuranceTaxPercent() {
		return insuranceTaxPercent;
	}
	public void setInsuranceTaxPercent(Double insuranceTaxPercent) {
		this.insuranceTaxPercent = insuranceTaxPercent;
	}
	public String getBillingPeriod() {
		return billingPeriod;
	}
	public void setBillingPeriod(String billingPeriod) {
		this.billingPeriod = billingPeriod;
	}
	public Boolean getIsEligible() {
		return isEligible;
	}
	public void setIsEligible(Boolean isEligible) {
		this.isEligible = isEligible;
	}
	

	
}
