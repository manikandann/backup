package com.mastercard.virtualservice.dto;

public class Weblink {

	private String linkDesc;
	private String documentType;
	private String url;
	
	public Weblink() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Weblink(String linkDesc, String documentType, String url) {
		super();
		this.linkDesc = linkDesc;
		this.documentType = documentType;
		this.url = url;
	}

	public String getLinkDesc() {
		return linkDesc;
	}

	public void setLinkDesc(String linkDesc) {
		this.linkDesc = linkDesc;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	

}
