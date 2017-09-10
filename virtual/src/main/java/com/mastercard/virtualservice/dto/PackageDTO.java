package com.mastercard.virtualservice.dto;



import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component(value="packages")
public class PackageDTO {
	
	private String packageId;
	private String packageName;
	private String packageDescription;
	private String packageDisplayName;
	private String packageimageUrl;
	private ArrayList<BenefitsDTO> benefits;
	private String packageImageDesc;
	private  Double price;
	private Double insurancePremiumPrice;
	private Double insuranceTaxPercent;
	private  String billingPeriod;
	private Boolean isEligible;
	
	public PackageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageDescription() {
		return packageDescription;
	}

	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}

	public ArrayList<BenefitsDTO> getBenefits() {
		return benefits;
	}

	public void setBenefits(ArrayList<BenefitsDTO> benefits) {
		this.benefits = benefits;
	}

	public PackageDTO(String packageId, String packageName, String packageDescription, String packageimageUrl,
			ArrayList<BenefitsDTO> benefits) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packageimageUrl = packageimageUrl;
		this.benefits = benefits;
	}

	public PackageDTO(String packageId, String packageDisplayName, String packageimageUrl, String packageImageDesc,
			Double price, Double insurancePremiumPrice, Double insuranceTaxPercent, String billingPeriod,
			Boolean isEligible) {
		super();
		this.packageId = packageId;
		this.packageDisplayName = packageDisplayName;
		this.packageimageUrl = packageimageUrl;
		this.packageImageDesc = packageImageDesc;
		this.price = price;
		this.insurancePremiumPrice = insurancePremiumPrice;
		this.insuranceTaxPercent = insuranceTaxPercent;
		this.billingPeriod = billingPeriod;
		this.isEligible = isEligible;
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getPackageDisplayName() {
		return packageDisplayName;
	}

	public void setPackageDisplayName(String packageDisplayName) {
		this.packageDisplayName = packageDisplayName;
	}

	public String getPackageimageUrl() {
		return packageimageUrl;
	}

	public void setPackageimageUrl(String packageimageUrl) {
		this.packageimageUrl = packageimageUrl;
	}

	public String getPackageImageDesc() {
		return packageImageDesc;
	}

	public void setPackageImageDesc(String packageImageDesc) {
		this.packageImageDesc = packageImageDesc;
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
