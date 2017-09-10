package com.mastercard.virtualservice.dto;

import org.springframework.stereotype.Component;

@Component(value="baseBenefits")
public class BaseBenefitDTO {
	private String benefitId;
	private String benefitName;
	private String benefitDescription;
	private String benefitAttribute;
	
	
	public String getBenefitId() {
		return benefitId;
	}


	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}


	public String getBenefitName() {
		return benefitName;
	}


	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}


	public String getBenefitDescription() {
		return benefitDescription;
	}


	public void setBenefitDescription(String benefitDescription) {
		this.benefitDescription = benefitDescription;
	}


	public String getBenefitAttribute() {
		return benefitAttribute;
	}


	public void setBenefitAttribute(String benefitAttribute) {
		this.benefitAttribute = benefitAttribute;
	}


	public BaseBenefitDTO(String benefitId, String benefitName, String benefitDescription, String benefitAttribute) {
		super();
		this.benefitId = benefitId;
		this.benefitName = benefitName;
		this.benefitDescription = benefitDescription;
		this.benefitAttribute = benefitAttribute;
	}


	public BaseBenefitDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
