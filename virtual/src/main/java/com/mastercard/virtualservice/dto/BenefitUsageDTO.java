package com.mastercard.virtualservice.dto;

import java.util.List;

public class BenefitUsageDTO {
private String vendorId;
private String vendorName;
private String benefitId;
private String benefitName;
private List<UsageDetailDTO> usageDetail;

public BenefitUsageDTO()
{
super();
}

public BenefitUsageDTO(String vendorId, String vendorName, String benefitId, String benefitName,
		List<UsageDetailDTO> usageDetail) {
	super();
	this.vendorId = vendorId;
	this.vendorName = vendorName;
	this.benefitId = benefitId;
	this.benefitName = benefitName;
	this.usageDetail = usageDetail;
}
public String getVendorId() {
	return vendorId;
}
public void setVendorId(String vendorId) {
	this.vendorId = vendorId;
}
public String getVendorName() {
	return vendorName;
}
public void setVendorName(String vendorName) {
	this.vendorName = vendorName;
}
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
public List<UsageDetailDTO> getUsageDetail() {
	return usageDetail;
}
public void setUsageDetail(List<UsageDetailDTO> usageDetail) {
	this.usageDetail = usageDetail;
}


}
