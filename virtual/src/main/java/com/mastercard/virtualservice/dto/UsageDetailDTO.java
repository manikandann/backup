package com.mastercard.virtualservice.dto;


import java.util.Date;

public class UsageDetailDTO {
private String date;
private String description;

public UsageDetailDTO() {
	super();
}
public UsageDetailDTO(String date, String description) {
	super();
	this.date = date;
	this.description = description;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
