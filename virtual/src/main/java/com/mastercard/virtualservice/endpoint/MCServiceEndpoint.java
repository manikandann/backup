package com.mastercard.virtualservice.endpoint;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mastercard.virtualservice.dto.AccountType;
import com.mastercard.virtualservice.dto.BaseBenefitDTO;
import com.mastercard.virtualservice.dto.BenefitSelectionWindow;
import com.mastercard.virtualservice.dto.BenefitsDTO;
import com.mastercard.virtualservice.dto.PackageDTO;
import com.mastercard.virtualservice.dto.ProgarmTermsFAQSDTO;
import com.mastercard.virtualservice.dto.RetrieveMemberDTO;
import com.mastercard.virtualservice.dto.SelectionRulesDTO;
import com.mastercard.virtualservice.dto.SelectionType;
import com.mastercard.virtualservice.dto.Document;
import com.mastercard.virtualservice.dto.FeatureDTO;
import com.mastercard.virtualservice.dto.FutureBenefitsDTO;
import com.mastercard.virtualservice.dto.FutureBundlesDTO;
import com.mastercard.virtualservice.dto.Image;
import com.mastercard.virtualservice.dto.OrganizationCatalogDTO;
import com.mastercard.virtualservice.dto.OrganizationCustomers;
import com.mastercard.virtualservice.dto.OrgCustBenefitsDTO;
import com.mastercard.virtualservice.dto.OrgCustBenefitsDetailsDTO;
import com.mastercard.virtualservice.dto.Weblink;

@Controller
@RequestMapping(value = "/mc")
public class MCServiceEndpoint {
	
	private static final Logger LOGGER = Logger.getLogger(MCServiceEndpoint.class);
	
	@RequestMapping(value = "/getOrganizationCustBenefitDetail", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public OrgCustBenefitsDetailsDTO getOrganizationCustBenefitDetail(

			@RequestParam(value="apiKey",required = false) String apiKey,
			@RequestParam(value="issuerId",required = false) Long issuerId,
			@RequestParam(value="cardNumber",required = false) String cardNumber,
			@RequestParam(value="bankacctId",required = false) Long  bankacctId,
			@RequestParam(value="custId",required = false) Long custId,
			@RequestParam(value="catalogId",required = false) Long catalogId,
			@RequestParam(value="benefitId",required = false) Long  benefitId,
			@RequestParam(value="channel",required = false) String channel,
			@RequestParam(value="locale",required = false) String locale
	) {
		LOGGER.info("-- Entering MCServiceEndpoint getOrganizationCustBenefitDetail --");
		OrgCustBenefitsDetailsDTO orgCustBenefitsDetailsDTO;
		if (issuerId==4004 || issuerId==4005 || issuerId==3001 || issuerId==3003
				|| issuerId==2017 || issuerId==2018) {
			orgCustBenefitsDetailsDTO=orgCustBenefitDetailResponse("B000-Success");
		}
		else{
			orgCustBenefitsDetailsDTO=orgCustBenefitDetailResponse("B201-BenefitNotFound");
		}
		LOGGER.info("-- Exiting  MCServiceEndpoint getOrganizationCustBenefitDetail --");
		return orgCustBenefitsDetailsDTO;
	}

	@RequestMapping(value = "/getOrganizationCustBenefits", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public OrgCustBenefitsDTO getOrganizationCustBenefits(@RequestParam(value = "apiKey",required = false) String apiKey,
													 @RequestParam(value = "cardNum", required = false) String cardNum,
													 @RequestParam(value = "issuerId",required = false) String issuerId,
													 @RequestParam(value = "custId", required = false) String custId,
													 @RequestParam(value = "productCode", required = false) String productCode,
													 @RequestParam(value = "locale", required = false) String locale,
													 @RequestParam(value = "channel",required = false) String channel,
													 @RequestParam(value = "bankacctId", required = false) String bankacctId) {

		LOGGER.info("-- Entering MCServiceEndpoint getOrganizationCustBenefits --");
		OrgCustBenefitsDTO orgCustBenefitsDTO;
		if (issuerId.equals("4004") || issuerId.equals("4005") || issuerId.equals("3001") || issuerId.equals("3003")
				|| issuerId.equals("2017") || issuerId.equals("2018")) {
			orgCustBenefitsDTO=buildOrgCustBenefitsDTO("B000-Success", issuerId);
		} else {
			orgCustBenefitsDTO=buildOrgCustBenefitsDTO("B201-BenefitNotFound", issuerId);

		}
		LOGGER.info("-- Exiting  MCServiceEndpoint getOrganizationCustBenefits --");
		return orgCustBenefitsDTO;
	}


	private OrgCustBenefitsDetailsDTO  orgCustBenefitDetailResponse(String excpCd){
		OrgCustBenefitsDetailsDTO orgCustBenefitsDetailsDTO;
		Image image=new Image("http://mcimg.jpeg","http://mctestcontenturl","mctestDescription");
		ArrayList<Image> imageList=new ArrayList<Image>();
		imageList.add(image);
		Document document=new Document("mcTestdescm","mcTestType","http://mcStaticurl");
		ArrayList<Document> documentList=new ArrayList<Document>();
		documentList.add(document);
		Weblink weblink=new Weblink("mcTestwebdesc","mcTestwebtype","http://mcweburl");
		ArrayList<Weblink> weblinkList=new ArrayList<Weblink>();
		weblinkList.add(weblink);
		if (excpCd == "B000-Success") {
			orgCustBenefitsDetailsDTO =new OrgCustBenefitsDetailsDTO(excpCd,"mcTestorgdetailDesc",imageList,documentList,weblinkList);
		}
		else{
			orgCustBenefitsDetailsDTO =new OrgCustBenefitsDetailsDTO(excpCd,null,null,null,null);
		}
		return orgCustBenefitsDetailsDTO;
	}
	private OrgCustBenefitsDTO buildOrgCustBenefitsDTO(String excpCd, String catlogId) {

		BenefitsDTO benefits = new BenefitsDTO("87458", "mcTestbenefitName", "02/01/2017", "09/11/2017", "mcTestAttribute",
				"http://mcbenefitimage.jpeg", 50.0, 6.1, 2.0, "6", true);
		ArrayList<BenefitsDTO> benefitsList = new ArrayList<BenefitsDTO>();
		benefitsList.add(benefits);
		PackageDTO bundles = new PackageDTO("5471", "mctestBundlename", "http://mcbundlemage.jpeg", "mcTestDesc", 20.0, 4.0, 1.0, "3",
				true);
		ArrayList<PackageDTO> bundlesList = new ArrayList<PackageDTO>();
		bundlesList.add(bundles);
		FutureBenefitsDTO futureBenefits = new FutureBenefitsDTO("8745", "mcTestfuturebenefitName", "05/01/2017", "05/11/2017",
				"mcTestAttribute", "http://mcbenefitimage.jpeg", 60.0, 3.1, 3.0, "9", true);
		ArrayList<FutureBenefitsDTO> futureBenefitsList = new ArrayList<FutureBenefitsDTO>();
		futureBenefitsList.add(futureBenefits);
		FutureBundlesDTO futureBundles = new FutureBundlesDTO("6547", "mcTestfutureBundlename", "http://mcbundlemage.jpeg", "mcTestDesc", 77.0,
				9.0, 3.0, "9", true);
		ArrayList<FutureBundlesDTO> futureBundlesList = new ArrayList<FutureBundlesDTO>();
		futureBundlesList.add(futureBundles);

		OrgCustBenefitsDTO orgCustBenefitsDTO;
		if (excpCd == "B000-Success") {
			orgCustBenefitsDTO = new OrgCustBenefitsDTO(excpCd, catlogId, bundlesList, benefitsList, futureBundlesList,
					futureBenefitsList);
		} else {
			orgCustBenefitsDTO = new OrgCustBenefitsDTO(excpCd, null, null, null, null, null);
		}
		return orgCustBenefitsDTO;
	}
	
	@RequestMapping(value="/enrollMember")
	@ResponseBody
	public String enrollMember(
			@RequestParam(value = "apiKey", required = true) String apiKey,
            @RequestParam(value = "organizationId", required = true) Long organizationId,
            @RequestParam(value = "customerId", required = true) String customerId,
            @RequestParam(value = "catalogId", required = true) String catalogId,
            @RequestParam(value = "title") Optional<String> title,
            @RequestParam(value = "suffix") Optional<String> suffix,
            @RequestParam(value = "firstName", required = true) String firstName,
            @RequestParam(value = "middleName") Optional<String> middleName,
            @RequestParam(value = "lastName") Optional<String> lastName,
            @RequestParam(value = "salutation") Optional<String> salutation,
            @RequestParam(value = "dateOfBirth", required = true) String dateOfBirth,
            @RequestParam(value = "emailAddress") Optional<String> emailAddress,
            @RequestParam(value = "cardNumber") Optional<String> cardNumber,
           @RequestParam(value = "expirationDate") Optional<String> expirationDate,
           @RequestParam(value = "cardStartDate") Optional<String> cardStartDate,
           @RequestParam(value = "nameOnCard") Optional<String> nameOnCard,
           @RequestParam(value = "oldCardNumber") Optional<String> oldCardNumber,
           @RequestParam(value = "oldCardStatus") Optional<String> oldCardStatus,
           @RequestParam(value = "cardIssueNumber") Optional<String> cardIssueNumber,
           @RequestParam(value = "nationalId") Optional<String> nationalId,
           @RequestParam(value = "mailingName") Optional<String> mailingName,
           @RequestParam(value = "mailingAddress", required = true) String mailingAddress,
           @RequestParam(value = "mailingAddress1") Optional<String> mailingAddress1,
           @RequestParam(value = "mailingAddress2") Optional<String> mailingAddress2,
           @RequestParam(value = "mailingAddress3") Optional<String> mailingAddress3,
           @RequestParam(value = "city", required = true) String city,
           @RequestParam(value = "county") Optional<String> county,
           @RequestParam(value = "country", required = true) String country,
           @RequestParam(value = "postalCode") Optional<String> postalCode,
           @RequestParam(value = "language") Optional<String> language,
           @RequestParam(value = "homePhoneNumber") Optional<String> homePhoneNumber,
           @RequestParam(value = "mobilePhoneNumber") Optional<String> mobilePhoneNumber,
           @RequestParam(value = "suppressAllMail") Optional<Boolean> suppressAllMail,
           @RequestParam(value = "suppressMail") Optional<Boolean> suppressMail,
           @RequestParam(value = "suppressAllEmail") Optional<Boolean> suppressAllEmail,
           @RequestParam(value = "suppressEmail") Optional<Boolean> suppressEmail,
           @RequestParam(value = "isPrimary") Optional<Boolean> isPrimary,
           @RequestParam(value = "isDeceased") Optional<Boolean> isDeceased,
           @RequestParam(value = "gender") Optional<Boolean> gender,
           @RequestParam(value = "bankAccountId", required = true) String bankAccountId,
           @RequestParam(value = "bankAccountNumber") Optional<String> bankAccountNumber,
           @RequestParam(value = "controlDigit") Optional<String> controlDigit,
           @RequestParam(value = "sortCode") Optional<String> sortCode,
           @RequestParam(value = "iban") Optional<String> iban,
           @RequestParam(value = "bic") Optional<String> bic,
           @RequestParam(value = "accountType", required = true) AccountType accountType,//<- TODO: Is this case sensitive?
           @RequestParam(value = "joinDate") Optional<LocalDate> joinDate,//<- JDK 8
           @RequestParam(value = "cancelReason") Optional<String> cancelReason,
           @RequestParam(value = "closeDate") Optional<LocalDate> closeDate//<- JDK 8
			){
		String respCode= "B000-success";
		LOGGER.info("completed enrollMember  method execution");
		return respCode;
	}
	
	@RequestMapping(value = "/getOrganizationCatalog", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE
			+ ";charset=UTF-8")
	@ResponseBody
	public OrganizationCatalogDTO getOrganizationCatalog(@RequestParam(value = "apiKey",required = false) String apiKey,
			@RequestParam(value = "organizationId",required = false) String organizationId,
			@RequestParam(value = "catalogId", required = false) String catalogId,
			@RequestParam(value = "locale", required = false) String locale) {
		LOGGER.info("-- Sterting VirtualServiceEndpoint getOrganizationCatalog --");
		OrganizationCatalogDTO orgCtlgDTO;
		if (organizationId.equals("1017") || organizationId.equals("1018")) {
			 orgCtlgDTO=crteRespForOrgCtlg("B000-success", organizationId);
		}
		else {
			 orgCtlgDTO=crteRespForOrgCtlg("B101-Member Not Found", organizationId);
		}

		LOGGER.info("-- Exiting VirtualServiceEndpoint getOrganizationCatalog --");
		return orgCtlgDTO;
	}

	
	private OrganizationCatalogDTO crteRespForOrgCtlg(String excpCd, String orgId) {

		//Benefits of Catalog
		
		String ctlgType="tiered";
		FeatureDTO feature= new FeatureDTO("testName","testDesc","2");
		ArrayList<FeatureDTO> featurelist=new ArrayList<FeatureDTO>();
		featurelist.add(feature);
		BaseBenefitDTO basebenefit= new BaseBenefitDTO("testId","testBenefitName","TestbenefitDesc","3");
		ArrayList<BaseBenefitDTO> basebenefitlist=new ArrayList<BaseBenefitDTO>();
		basebenefitlist.add(basebenefit);
//		ImageUrlDTO image= new ImageUrlDTO();
//		image.setMedium();
		BenefitsDTO benefitBundle=new BenefitsDTO("testbenefitid","Testbenefitname","Testbenefitattribute");
		ArrayList<BenefitsDTO> benefitBundlelist=new ArrayList<BenefitsDTO>();
		benefitBundlelist.add(benefitBundle);
		PackageDTO bundle=new  PackageDTO("123","Testbundlename","Testbundledesc","http://image.jpeg",benefitBundlelist);	
		ArrayList<PackageDTO> bundleLst=new ArrayList<PackageDTO>();
		bundleLst.add(bundle);
//		ImageUrlDTO image1= new ImageUrlDTO();
//		image1.setMedium();
		BenefitsDTO benefit=new BenefitsDTO("234","Testname","Testbenefit","http://image1.jpeg","testattribute");
		ArrayList<BenefitsDTO> benefitlist=new ArrayList<BenefitsDTO>();
		benefitlist.add(benefit);
		SelectionRulesDTO selectionrules=new SelectionRulesDTO(SelectionType.SelfSelect,"min","max");
		OrganizationCatalogDTO orgCtlgDTO;
		if (excpCd == "B000-success") {
			orgCtlgDTO = new OrganizationCatalogDTO(excpCd, ctlgType, featurelist, basebenefitlist, bundleLst,
					benefitlist,selectionrules);
		} else {
			orgCtlgDTO = new OrganizationCatalogDTO(excpCd, null, null, null, null, null,null);
		}
		return orgCtlgDTO;
	}
	
	@RequestMapping(value = "/retrieveMember")
	@ResponseBody
	public RetrieveMemberDTO retrieveMember(@RequestParam(value = "apiKey", required = false) String apiKey,
											@RequestParam(value = "orgId", required = false) Long orgId,
											@RequestParam(value = "custId", required = false) String custId,
											@RequestParam(value = "cardNumber", required = false) String cardNumber,
											@RequestParam(value = "bankacctId", required = false) String bankacctId

	) {

		BenefitSelectionWindow benefitSelectionWindow = new BenefitSelectionWindow("01/01/2018", "01/31/2018", true, true);
		ArrayList<BenefitSelectionWindow> benefitSelectionWindowlist = new ArrayList<BenefitSelectionWindow>();
		benefitSelectionWindowlist.add(benefitSelectionWindow);
		OrganizationCustomers organizationCustomers = new OrganizationCustomers(custId, "Mr", "", "TestFirstName", "TestMiddleName",
				"TestLastName", "", "01/01/1980", "test@test.com", "51111111111", "01/2018",
				"TestFirstName TestLastName", "111111111", "TestFirstName TestLastName", "111 Main St", "Apt 1", "",
				"St Louis", "St Clair", "USA", "63099", "English", "111111111", "11222222", "N", "N", "N", "N", "Y",
				"N", "M", "123", bankacctId, "1112233333", "1233", "1322", "12333", "JOINT", "01/01/2015", "", "",
				benefitSelectionWindowlist);
		ArrayList<OrganizationCustomers> organizationCustomerslist = new ArrayList<OrganizationCustomers>();
		organizationCustomerslist.add(organizationCustomers);
		RetrieveMemberDTO retrieveMemberDTO = new RetrieveMemberDTO("B000-success", organizationCustomerslist);
		LOGGER.info("completed retrieveMemberVSMC  method execution");
		return retrieveMemberDTO;
	}
	@RequestMapping(value = "/getProgramTermsandFAQS" ,method = RequestMethod.GET)
	@ResponseBody
	public ProgarmTermsFAQSDTO getProgramTermsandFAQS(@RequestParam(value = "apiKey", required =true) String apiKey,
			@RequestParam(value = "issuerId", required = true) String issuerId,
			@RequestParam(value = "bankaccountId", required = false) String bankaccountId,
			@RequestParam(value = "customerId", required = false) String customerId,
			@RequestParam(value = "locale", required = false) String locale) {
           
		ProgarmTermsFAQSDTO termsFAQSDTO;
		if (issuerId.equals("1017") || issuerId.equals("1018")) {
	     termsFAQSDTO=new ProgarmTermsFAQSDTO("B000-success","http://MBOProgramTermsandFAQS");
	    		 
		}else{
			termsFAQSDTO=new ProgarmTermsFAQSDTO("B000-success",null);
	    	 
		}
		return termsFAQSDTO;
	}
	
	

    private ProgarmTermsFAQSDTO createResponseForProgarmTermsFAQSDTO(String excpCd , String orgId) {
    	
    	ProgarmTermsFAQSDTO termsFAQSDTO=new ProgarmTermsFAQSDTO();
    	termsFAQSDTO.setExcpCd("B000-success");
    	termsFAQSDTO.setStaticContentUrl("http://MCProgramTermsandFAQS");
		return termsFAQSDTO ;
	}
}