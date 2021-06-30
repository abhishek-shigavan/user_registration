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
	}
	
	public static void main(String[] args) {
		
		getUserDetails();
	}
}
