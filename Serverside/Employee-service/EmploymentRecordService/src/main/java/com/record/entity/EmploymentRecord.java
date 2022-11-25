package com.record.entity;

public class EmploymentRecord {
	
	private Long cId;
	private String cName;
	private String cEmail;
	private Integer years;
	private Long eId;
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public Integer getYears() {
		return years;
	}
	public void setYears(Integer years) {
		this.years = years;
	}
	
	
	
	public EmploymentRecord(Long cId, String cName, String cEmail, Integer years) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.years = years;
	}
	@Override
	public String toString() {
		return "EmploymentRecord [cId=" + cId + ", cName=" + cName + ", cEmail=" + cEmail + ", years=" + years + "]";
	}
	

}
