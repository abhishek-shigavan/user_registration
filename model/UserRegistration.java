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
	private String mob_No;
	private String password;
	
	public UserRegistration() {
		
	}

	public UserRegistration(String f_Name, String l_Name, String emailId, String mob_No, String password) {
		
		this.f_Name = f_Name;
		this.l_Name = l_Name;
		this.emailId = emailId;
		this.mob_No = mob_No;
		this.password = password;
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

	public String getMob_No() {
		return mob_No;
	}

	public void setMob_No(String mob_No) {
		this.mob_No = mob_No;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
