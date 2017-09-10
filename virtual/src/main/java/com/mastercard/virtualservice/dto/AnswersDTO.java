package com.mastercard.virtualservice.dto;

import org.springframework.stereotype.Component;

@Component(value="answers")
public class AnswersDTO {

	private String answerId;
	private String answerText;
	
	public String getAnswerId() {
		return answerId;
	}
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
	public AnswersDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	
	
	public AnswersDTO(String answerId, String answerText) {
		super();
		this.answerId = answerId;
		this.answerText = answerText;
	}
}
