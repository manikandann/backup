package com.mastercard.virtualservice.dto;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class OrganizationCustomers {

    private String customerId;
    private String  title;
    private String  suffix;
    private String firstName;
    private String middleName;
    private String lastName;
    private String salutation; 
    private String  dob; 
    private String  emailAddress;
    private String  cardNumber;
    private String  expirationDate;
    private String   nameOnCard ; 
    private String  nationalId;
    private String   mailingName1; 
    private String   mailingAddress1;
    private String   mailingAddress2; 
    private String   mailingAddress3; 
    private String   city; 
    private String   county; 
    private String   country;
    private String   postalCode;
    private String   language; 
    private String   homePhoneNumber;
    private String   mobilePhoneNumber; 
    private String  suppressAllMailFlag; 
    private String    suppressMailFlag;
    private String  suppressAllEmailFlag;
    private String   suppressEmailFlag; 
    private String   isPrimary;
    private String   isDeceased;
    private String   gender; 
    private String   catalogId; 
    private String   bankAccountId; 
    private String  bankAccountNumber;  
    private String   sortCode; 
  
	private String    iban; 
    private String   bic; 
    private String    accountType;
    private String    joinDate; 
    private String    cancelReason;
    private String   closedDate;
    private ArrayList<BenefitSelectionWindow> benefitSelectionWindow;
                                                          
    public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getMailingName1() {
		return mailingName1;
	}

	public void setMailingName1(String mailingName1) {
		this.mailingName1 = mailingName1;
	}

	public String getMailingAddress1() {
		return mailingAddress1;
	}

	public void setMailingAddress1(String mailingAddress1) {
		this.mailingAddress1 = mailingAddress1;
	}

	public String getMailingAddress2() {
		return mailingAddress2;
	}

	public void setMailingAddress2(String mailingAddress2) {
		this.mailingAddress2 = mailingAddress2;
	}

	public String getMailingAddress3() {
		return mailingAddress3;
	}

	public void setMailingAddress3(String mailingAddress3) {
		this.mailingAddress3 = mailingAddress3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getSuppressAllMailFlag() {
		return suppressAllMailFlag;
	}

	public void setSuppressAllMailFlag(String suppressAllMailFlag) {
		this.suppressAllMailFlag = suppressAllMailFlag;
	}

	public String getSuppressMailFlag() {
		return suppressMailFlag;
	}

	public void setSuppressMailFlag(String suppressMailFlag) {
		this.suppressMailFlag = suppressMailFlag;
	}

	public String getSuppressAllEmailFlag() {
		return suppressAllEmailFlag;
	}

	public void setSuppressAllEmailFlag(String suppressAllEmailFlag) {
		this.suppressAllEmailFlag = suppressAllEmailFlag;
	}

	public String getSuppressEmailFlag() {
		return suppressEmailFlag;
	}

	public void setSuppressEmailFlag(String suppressEmailFlag) {
		this.suppressEmailFlag = suppressEmailFlag;
	}

	public String getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
	}

	public String getIsDeceased() {
		return isDeceased;
	}

	public void setIsDeceased(String isDeceased) {
		this.isDeceased = isDeceased;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public String getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(String bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(String closedDate) {
		this.closedDate = closedDate;
	}

	public ArrayList<BenefitSelectionWindow> getBenefitSelectionWindow() {
		return benefitSelectionWindow;
	}

	public void setBenefitSelectionWindow(ArrayList<BenefitSelectionWindow> benefitSelectionWindow) {
		this.benefitSelectionWindow = benefitSelectionWindow;
	}

	public OrganizationCustomers(String customerId, String title, String suffix, String firstName, String middleName,
			String lastName, String salutation, String dob, String emailAddress, String cardNumber,
			String expirationDate, String nameOnCard, String nationalId, String mailingName1, String mailingAddress1,
			String mailingAddress2, String mailingAddress3, String city, String county, String country,
			String postalCode, String language, String homePhoneNumber, String mobilePhoneNumber,
			String suppressAllMailFlag, String suppressMailFlag, String suppressAllEmailFlag, String suppressEmailFlag,
			String isPrimary, String isDeceased, String gender, String catalogId, String bankAccountId,
			String bankAccountNumber, String sortCode, String iban, String bic, String accountType, String joinDate,
			String cancelReason, String closedDate, ArrayList<BenefitSelectionWindow> benefitSelectionWindow) {
		super();
		this.customerId = customerId;
		this.title = title;
		this.suffix = suffix;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.salutation = salutation;
		this.dob = dob;
		this.emailAddress = emailAddress;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.nameOnCard = nameOnCard;
		this.nationalId = nationalId;
		this.mailingName1 = mailingName1;
		this.mailingAddress1 = mailingAddress1;
		this.mailingAddress2 = mailingAddress2;
		this.mailingAddress3 = mailingAddress3;
		this.city = city;
		this.county = county;
		this.country = country;
		this.postalCode = postalCode;
		this.language = language;
		this.homePhoneNumber = homePhoneNumber;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.suppressAllMailFlag = suppressAllMailFlag;
		this.suppressMailFlag = suppressMailFlag;
		this.suppressAllEmailFlag = suppressAllEmailFlag;
		this.suppressEmailFlag = suppressEmailFlag;
		this.isPrimary = isPrimary;
		this.isDeceased = isDeceased;
		this.gender = gender;
		this.catalogId = catalogId;
		this.bankAccountId = bankAccountId;
		this.bankAccountNumber = bankAccountNumber;
		this.sortCode = sortCode;
		this.iban = iban;
		this.bic = bic;
		this.accountType = accountType;
		this.joinDate = joinDate;
		this.cancelReason = cancelReason;
		this.closedDate = closedDate;
		this.benefitSelectionWindow = benefitSelectionWindow;
	}

	public OrganizationCustomers() {
  		super();
  		// TODO Auto-generated constructor stub
  	}
}
