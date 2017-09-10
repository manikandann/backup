package com.mastercard.virtualservice.dto;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component(value="questions")
public class QuestionsDTO {

	
private String questionId;
private String questionText;
private String qualifyingAnswer;
private String displayOrder;
private ArrayList<AnswersDTO> answers;
	

public QuestionsDTO(String questionId, String questionText,
		String qualifyingAnswer, String displayOrder,
		ArrayList<AnswersDTO> answers) {
	super();
	this.questionId = questionId;
	this.questionText = questionText;
	this.qualifyingAnswer = qualifyingAnswer;
	this.displayOrder = displayOrder;
	this.answers = answers;
}
public String getQuestionId() {
	return questionId;
}
public void setQuestionId(String questionId) {
	this.questionId = questionId;
}
public String getQuestionText() {
	return questionText;
}
public QuestionsDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public void setQuestionText(String questionText) {
	this.questionText = questionText;
}
public String getQualifyingAnswer() {
	return qualifyingAnswer;
}
public void setQualifyingAnswer(String qualifyingAnswer) {
	this.qualifyingAnswer = qualifyingAnswer;
}
public String getDisplayOrder() {
	return displayOrder;
}
public void setDisplayOrder(String displayOrder) {
	this.displayOrder = displayOrder;
}
public ArrayList<AnswersDTO> getAnswers() {
	return answers;
}
public void setAnswers(ArrayList<AnswersDTO> answers) {
	this.answers = answers;
}

}
