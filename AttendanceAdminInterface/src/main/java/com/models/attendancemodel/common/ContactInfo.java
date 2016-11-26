package com.models.attendancemodel.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("contactInfo")
@Scope("singleton")
public class ContactInfo {

	private String emailId;
	private String contactNo;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
}
