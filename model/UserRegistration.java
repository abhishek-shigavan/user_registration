package com.userregistration.model;
/**
 * UserRegistration -- Defining Properties of 
 * 					   User Registration Field
 * 
 * @author Abhishek Shigavan
 *
 */
public class UserRegistration {
	
	//UserRegistration Fields
	private String f_Name;
	private String l_Name;
	private String emailId;
	
	public UserRegistration() {
		
	}

	public UserRegistration(String f_Name, String l_Name, String emailId) {
		
		this.f_Name = f_Name;
		this.l_Name = l_Name;
		this.emailId = emailId;
	}

	public String getF_Name() {
		return f_Name;
	}

	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}

	public String getL_Name() {
		return l_Name;
	}

	public void setL_Name(String l_Name) {
		this.l_Name = l_Name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
