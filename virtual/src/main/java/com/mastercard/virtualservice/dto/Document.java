package com.mastercard.virtualservice.dto;

public class Document {
 
	 private String documentDesc;
	 private String docType;
	 private String staticContentURL;
	 
	
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDocumentDesc() {
		return documentDesc;
	}

	public void setDocumentDesc(String documentDesc) {
		this.documentDesc = documentDesc;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}
	 public String getStaticContentURL() {
			return staticContentURL;
		}

		public void setStaticContentURL(String staticContentURL) {
			this.staticContentURL = staticContentURL;
		}

		public Document(String documentDesc, String docType, String staticContentURL) {
			super();
			this.documentDesc = documentDesc;
			this.docType = docType;
			this.staticContentURL = staticContentURL;
		}

	
	 
	


}
