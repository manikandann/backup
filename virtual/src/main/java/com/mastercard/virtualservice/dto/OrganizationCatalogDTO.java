package com.mastercard.virtualservice.dto;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component(value="orgCtlgDTO")
public class OrganizationCatalogDTO {
	private String excpCd;
	private String catalogType;
	private ArrayList<FeatureDTO> feature;
	private ArrayList<BaseBenefitDTO> baseBenefit;
	private ArrayList<PackageDTO> packages;
	private ArrayList<BenefitsDTO> benefit;
	private SelectionRulesDTO selectionRules;
	
	public OrganizationCatalogDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrganizationCatalogDTO(String excpCd, String catalogType, ArrayList<FeatureDTO> feature,
			ArrayList<BaseBenefitDTO> baseBenefit, ArrayList<PackageDTO> packages, ArrayList<BenefitsDTO> benefit,
			SelectionRulesDTO selectionRules) {
		super();
		this.excpCd = excpCd;
		this.catalogType = catalogType;
		this.feature = feature;
		this.baseBenefit = baseBenefit;
		this.packages = packages;
		this.benefit = benefit;
		this.selectionRules = selectionRules;
	}

	public String getExcpCd() {
		return excpCd;
	}

	public void setExcpCd(String excpCd) {
		this.excpCd = excpCd;
	}

	public String getCatalogType() {
		return catalogType;
	}

	public void setCatalogType(String catalogType) {
		this.catalogType = catalogType;
	}

	public ArrayList<FeatureDTO> getFeature() {
		return feature;
	}

	public void setFeature(ArrayList<FeatureDTO> feature) {
		this.feature = feature;
	}

	public ArrayList<BaseBenefitDTO> getBaseBenefit() {
		return baseBenefit;
	}

	public void setBaseBenefit(ArrayList<BaseBenefitDTO> baseBenefit) {
		this.baseBenefit = baseBenefit;
	}

	public ArrayList<PackageDTO> getPackage() {
		return packages;
	}

	public void setPackage(ArrayList<PackageDTO> packages) {
		this.packages = packages;
	}

	public ArrayList<BenefitsDTO> getBenefit() {
		return benefit;
	}

	public void setBenefit(ArrayList<BenefitsDTO> benefit) {
		this.benefit = benefit;
	}

	public SelectionRulesDTO getSelectionRules() {
		return selectionRules;
	}

	public void setSelectionRules(SelectionRulesDTO selectionRules) {
		this.selectionRules = selectionRules;
	}
	
}
