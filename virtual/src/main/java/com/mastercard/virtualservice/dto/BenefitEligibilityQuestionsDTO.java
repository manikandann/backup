package com.mastercard.virtualservice.dto;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component(value="benefitEligibilityQuestionsDTO")
public class BenefitEligibilityQuestionsDTO {

	private String excpCd;
	private ArrayList<String> bnftId;
	private ArrayList<QuestionsDTO> questions;
	
	public BenefitEligibilityQuestionsDTO(String excpCd,
			ArrayList<String> bnftId, ArrayList<QuestionsDTO> questions) {
		super();
		this.excpCd = excpCd;
		this.bnftId = bnftId;
		this.questions = questions;
	}


	public BenefitEligibilityQuestionsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getExcpCd() {
		return excpCd;
	}
	public void setExcpCd(String excpCd) {
		this.excpCd = excpCd;
	}
	public ArrayList<String> getBnftId() {
		return bnftId;
	}
	public void setBnftId(ArrayList<String> bnftId) {
		this.bnftId = bnftId;
	}
	public ArrayList<QuestionsDTO> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<QuestionsDTO> questions) {
		this.questions = questions;
	}
	
}
