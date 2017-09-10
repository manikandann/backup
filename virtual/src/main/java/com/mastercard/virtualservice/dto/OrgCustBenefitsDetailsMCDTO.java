package com.mastercard.virtualservice.dto;

import java.util.ArrayList;

public class OrgCustBenefitsDetailsMCDTO {

	
	private String excpCd;
	private String description;
	private ArrayList<Image> pictureURL;
	private ArrayList<Document> document;
	private ArrayList<Weblink> weblink;
	public OrgCustBenefitsDetailsMCDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrgCustBenefitsDetailsMCDTO(String excpCd, String description, ArrayList<Image> pictureURL,
			ArrayList<Document> document, ArrayList<Weblink> weblink) {
		super();
		this.excpCd = excpCd;
		this.description = description;
		this.pictureURL = pictureURL;
		this.document = document;
		this.weblink = weblink;
	}
	public String getExcpCd() {
		return excpCd;
	}
	public void setExcpCd(String excpCd) {
		this.excpCd = excpCd;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Image> getImageUrl() {
		return pictureURL;
	}
	public void setImageUrl(ArrayList<Image> pictureURL) {
		this.pictureURL = pictureURL;
	}
	public ArrayList<Document> getDocument() {
		return document;
	}
	public void setDocument(ArrayList<Document> document) {
		this.document = document;
	}
	public ArrayList<Weblink> getWeblink() {
		return weblink;
	}
	public void setWeblink(ArrayList<Weblink> weblink) {
		this.weblink = weblink;
	}
	
	
	

}
