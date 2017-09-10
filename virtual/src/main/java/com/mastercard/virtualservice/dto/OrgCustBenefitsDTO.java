package com.mastercard.virtualservice.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component(value="orgCustBenefitsDTO")
public class OrgCustBenefitsDTO {
	private String  excpCd;
	private String catalogId;
	private ArrayList<PackageDTO> bundles;
	private ArrayList<BenefitsDTO> benefits;
	private ArrayList<FutureBundlesDTO> futureBundles;
	private ArrayList<FutureBenefitsDTO> futureBenefits;

	public OrgCustBenefitsDTO(String excpCd, String catalogId, ArrayList<PackageDTO> bundles, ArrayList<BenefitsDTO> benefits,
			ArrayList<FutureBundlesDTO> futureBundles, ArrayList<FutureBenefitsDTO> futureBenefits) {
		super();
		this.excpCd = excpCd;
		this.catalogId = catalogId;
		this.bundles = bundles;
		this.benefits = benefits;
		this.futureBundles = futureBundles;
		this.futureBenefits = futureBenefits;
	}

	public OrgCustBenefitsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getExcpCd() {
		return excpCd;
	}

	public void setExcpCd(String excpCd) {
		this.excpCd = excpCd;
	}

	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public ArrayList<PackageDTO> getBundles() {
		return bundles;
	}

	public void setBundles(ArrayList<PackageDTO> bundles) {
		this.bundles = bundles;
	}

	public ArrayList<BenefitsDTO> getBenefits() {
		return benefits;
	}

	public void setBenefits(ArrayList<BenefitsDTO> benefits) {
		this.benefits = benefits;
	}

	public ArrayList<FutureBundlesDTO> getFutureBundles() {
		return futureBundles;
	}

	public void setFutureBundles(ArrayList<FutureBundlesDTO> futureBundles) {
		this.futureBundles = futureBundles;
	}

	public ArrayList<FutureBenefitsDTO> getFutureBenefits() {
		return futureBenefits;
	}

	public void setFutureBenefits(ArrayList<FutureBenefitsDTO> futureBenefits) {
		this.futureBenefits = futureBenefits;
	}

}
