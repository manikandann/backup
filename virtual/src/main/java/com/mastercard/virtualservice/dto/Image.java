package com.mastercard.virtualservice.dto;

public class Image {

	private String picurl;
	private String contentUrl;
	private String shortDesc;
	
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(String picurl, String contentUrl, String shortDesc) {
		super();
		this.picurl = picurl;
		this.contentUrl = contentUrl;
		this.shortDesc = shortDesc;
	}
	
	public String getContentUrl() {
		return contentUrl;
	}
	public String getPicurl() {
		return picurl;
	}
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	
   

}
