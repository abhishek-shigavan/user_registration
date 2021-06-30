package com.userregistration.controller;

import java.util.Scanner;
import com.userregistration.model.UserRegistration;
import com.userregistration.service.UserRegistrationService;

public class UserRegistrationMain {
	
	static Scanner sc = new Scanner(System.in);
/**
 * This method get registration field details
 * from user & set the field properties
 * 
 * @return No return	
 */
	public static void getUserDetails() {
		
		UserRegistration userDetails = new UserRegistration();
		
		//Taking details from user		
		System.out.println("Enter First Name : ");
		userDetails.setF_Name(sc.next());
		
		System.out.println("Enter Last Name : ");
		userDetails.setL_Name(sc.next());
		
		System.out.println("Enter E-mail Id : ");
		userDetails.setEmailId(sc.next());
		
		System.out.println("Enter Mobile No : ");
		userDetails.setMob_No(sc.next());
		
		validatedUserDetails(userDetails);
	}
/**
 * This method pass field details to validate
 * & according to result of validation prints results
 * 	
 * @param userDeatils
 * @return No return
 */
	public static void validatedUserDetails(UserRegistration userDeatils) {
		
		UserRegistrationService service = new UserRegistrationService();
		
		//passing field details to validate
		if(service.validateFirstName(userDeatils.getF_Name())) {
			
			System.out.println("First Name is Valid");
		}
		else {
			
			System.out.println("Invalid First Name");
		}
		
		if(service.validateLastName(userDeatils.getL_Name())) {
			System.out.println("Last Name is Valid");
		}
		else {
			System.out.println("Invalid Last Name");
		}
		
		if(service.validateEmailId(userDeatils.getEmailId())) {
			System.out.println("Email Id is Valid");
		}
		else {
			System.out.println("Invalid Email Id");
		}
		
		if(service.validateMobNo(userDeatils.getMob_No())) {
			System.out.println("Mobile Number is Valid");
		}
		else {
			System.out.println("Invalid Mobile Number");
		}
	}
	
	public static void main(String[] args) {
		
		getUserDetails();
	}
}
