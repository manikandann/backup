package com.mastercard.virtualservice.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component(value="bundles")
public class BundlesDTO {
	private String bundleDisplayName="";
	private List<String> bundleImageUrls=new ArrayList<String>();
	private String bundled="";

	//GetOrganizationCustomerBenefits
	private String bundleId="";
	private List<ImageUrlDTO> bundleImageURL=new ArrayList<ImageUrlDTO>();
	private BundleDescriptionDTO bundleDescriptionDTO=new BundleDescriptionDTO();
	private String price="";
	private String insurncePremiumPrice="";
	private String insuranceTaxPercent="";
	private String billingPeriod="";
	private String isEligible="";
	private List<BenefitsDTO> benefits=new ArrayList<BenefitsDTO>();


	
	public List<BundlesDTO> addBundles(List<BundlesDTO> listOfBundles, BundlesDTO bundle)
	{
		listOfBundles.add(bundle);
		return listOfBundles;
	}

}
