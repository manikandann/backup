package com.mastercard.virtualservice.dto;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class RetrieveMemberDTO {

	private String excpCd;	
	private ArrayList<OrganizationCustomers> organizationCustomers;
	
	public RetrieveMemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RetrieveMemberDTO(String excpCd, ArrayList<OrganizationCustomers> organizationCustomers) {
		super();
		this.excpCd = excpCd;
		this.organizationCustomers = organizationCustomers;
	}
	
	
	public String getExcpCd() {
		return excpCd;
	}
	public void setExcpCd(String excpCd) {
		this.excpCd = excpCd;
	}	
	public ArrayList<OrganizationCustomers> getOrganizationCustomers() {
		return organizationCustomers;
	}
	public void setOrganizationCustomers(ArrayList<OrganizationCustomers> organizationCustomers) {
		this.organizationCustomers = organizationCustomers;
	}
}
