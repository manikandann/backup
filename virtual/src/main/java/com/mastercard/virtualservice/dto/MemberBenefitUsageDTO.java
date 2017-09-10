package com.mastercard.virtualservice.dto;

import java.util.List;

public class MemberBenefitUsageDTO {
	private String excpCd;
	private List<BenefitUsageDTO> benefitUsage;
	
	public MemberBenefitUsageDTO() {
		super();
	}
	
	public MemberBenefitUsageDTO(String excpCd, List<BenefitUsageDTO> benefitUsage) {
		super();
		this.excpCd = excpCd;
		this.benefitUsage = benefitUsage;
	}
	public String getExcpCd() {
		return excpCd;
	}
	public void setExcpCd(String excpCd) {
		this.excpCd = excpCd;
	}
	public List<BenefitUsageDTO> getBenefitUsage() {
		return benefitUsage;
	}
	public void setBenefitUsage(List<BenefitUsageDTO> benefitUsage) {
		this.benefitUsage = benefitUsage;
	}
	
	
}
