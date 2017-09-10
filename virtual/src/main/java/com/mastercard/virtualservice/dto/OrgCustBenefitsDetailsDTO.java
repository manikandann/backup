package com.mastercard.virtualservice.dto;

import java.util.ArrayList;

import org.springframework.stereotype.Component;



@Component(value="orgCustBenefitsDetailsDTO")
public class OrgCustBenefitsDetailsDTO {
	
	private String excpCd;
	private String description;
	private ArrayList<Image> imageUrl;
	private ArrayList<Document> document;
	private ArrayList<Weblink> weblink;
	public OrgCustBenefitsDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrgCustBenefitsDetailsDTO(String excpCd, String description, ArrayList<Image> imageUrl,
			ArrayList<Document> document, ArrayList<Weblink> weblink) {
		super();
		this.excpCd = excpCd;
		this.description = description;
		this.imageUrl = imageUrl;
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
		return imageUrl;
	}
	public void setImageUrl(ArrayList<Image> imageUrl) {
		this.imageUrl = imageUrl;
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
