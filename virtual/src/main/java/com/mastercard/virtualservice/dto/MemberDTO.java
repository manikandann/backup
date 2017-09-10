package com.mastercard.virtualservice.dto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component(value="member")
public class MemberDTO {
	
	private String firstName;
	private String lastName;
	private String catalogId;
	private String customerId;
	private String primary;
	private PackageDTO bundles;
	private BenefitsDTO benefits;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPrimary() {
		return primary;
	}
	public void setPrimary(String primary) {
		this.primary = primary;
	}
	public PackageDTO getBundles() {
		return bundles;
	}
	public void setBundles(PackageDTO bundles) {
		this.bundles = bundles;
	}
	public BenefitsDTO getBenefits() {
		return benefits;
	}
	public void setBenefits(BenefitsDTO benefits) {
		this.benefits = benefits;
	}
	
	public List<MemberDTO> addBundles(List<MemberDTO> listOfMembers, MemberDTO member)
	{
		listOfMembers.add(member);
		return listOfMembers;
	}	

}
