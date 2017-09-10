package com.mastercard.virtualservice.dto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component(value="bankAccountId")
public class BankAccountIdDTO {
	private BenefitSelectionDTO benefitSelection;
	private MemberDTO member;
	public BenefitSelectionDTO getBenefitSelection() {
		return benefitSelection;
	}
	public void setBenefitSelection(BenefitSelectionDTO benefitSelection) {
		this.benefitSelection = benefitSelection;
	}
	public MemberDTO getMember() {
		return member;
	}
	public void setMember(MemberDTO member) {
		this.member = member;
	}
	
	public List<BankAccountIdDTO> addBundles(List<BankAccountIdDTO> listOfbankAccountIds, BankAccountIdDTO bankAccountId)
	{
		listOfbankAccountIds.add(bankAccountId);
		return listOfbankAccountIds;
	}
	
}
