package com.java.reprisk.assignment;

public class Company {
	long companyId;
	String companyName;
	String additionalInformatiom;

	public Company(long companyId, String companyName, String additionalInformatiom) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.additionalInformatiom = additionalInformatiom;
	}

	public Company() {
		super();
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAdditionalInformatiom() {
		return additionalInformatiom;
	}

	public void setAdditionalInformatiom(String additionalInformatiom) {
		this.additionalInformatiom = additionalInformatiom;
	}
}
