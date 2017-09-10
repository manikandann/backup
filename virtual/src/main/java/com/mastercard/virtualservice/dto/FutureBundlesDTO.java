package com.mastercard.virtualservice.dto;



import org.springframework.stereotype.Component;

@Component(value="futureBundles")
public class FutureBundlesDTO {
	
	private String bundleId;
	private String bundleDisplayName;
	private String bundleimageUrl;
	private String bundleImageDesc;
	private  Double price;
	private Double insurancePremiumPrice;
	private Double insuranceTaxPercent;
	private  String billingPeriod;
	private Boolean isEligible;
	
	public FutureBundlesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FutureBundlesDTO(String bundleId, String bundleDisplayName, String bundleimageUrl, String bundleImageDesc,
			Double price, Double insurancePremiumPrice, Double insuranceTaxPercent, String billingPeriod,
			Boolean isEligible) {
		super();
		this.bundleId = bundleId;
		this.bundleDisplayName = bundleDisplayName;
		this.bundleimageUrl = bundleimageUrl;
		this.bundleImageDesc = bundleImageDesc;
		this.price = price;
		this.insurancePremiumPrice = insurancePremiumPrice;
		this.insuranceTaxPercent = insuranceTaxPercent;
		this.billingPeriod = billingPeriod;
		this.isEligible = isEligible;
	}


	public String getBundleId() {
		return bundleId;
	}


	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}


	public String getBundleDisplayName() {
		return bundleDisplayName;
	}


	public void setBundleDisplayName(String bundleDisplayName) {
		this.bundleDisplayName = bundleDisplayName;
	}


	public String getBundleimageUrl() {
		return bundleimageUrl;
	}


	public void setBundleimageUrl(String bundleimageUrl) {
		this.bundleimageUrl = bundleimageUrl;
	}


	public String getBundleImageDesc() {
		return bundleImageDesc;
	}


	public void setBundleImageDesc(String bundleImageDesc) {
		this.bundleImageDesc = bundleImageDesc;
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
