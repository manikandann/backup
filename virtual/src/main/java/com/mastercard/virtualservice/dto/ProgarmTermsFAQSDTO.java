package com.mastercard.virtualservice.dto;

public class ProgarmTermsFAQSDTO {
	private String excpCd;
	private String staticContentUrl;

	public ProgarmTermsFAQSDTO() {
		super();
	}

	public ProgarmTermsFAQSDTO(String excpCd, String staticContentUrl) {
		super();
		this.excpCd = excpCd;
		this.staticContentUrl = staticContentUrl;
	}

	

	public String getExcpCd() {
		return excpCd;
	}

	public void setExcpCd(String excpCd) {
		this.excpCd = excpCd;
	}

	public String getStaticContentUrl() {
		return staticContentUrl;
	}

	public void setStaticContentUrl(String staticContentUrl) {
		this.staticContentUrl = staticContentUrl;
	}

}
