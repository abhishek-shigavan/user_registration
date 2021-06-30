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

	public UserRegistration() {
		
	}

	public UserRegistration(String f_Name) {
		
		this.f_Name = f_Name;
	}

	public String getF_Name() {
		return f_Name;
	}

	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}
}
