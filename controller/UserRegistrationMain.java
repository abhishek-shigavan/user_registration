package com.userregistration.controller;

import java.util.ArrayList;
import java.util.Scanner;
import com.userregistration.model.UserRegistration;
import com.userregistration.service.UserRegistrationService;

public class UserRegistrationMain extends UserRegistrationService {
	
	static Scanner sc = new Scanner(System.in);
	static UserRegistrationService service = new UserRegistrationService();
	
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
		
		System.out.println("Enter Password : ");
		userDetails.setPassword(sc.next());
		
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
		
		if(service.validatePassword(userDeatils.getPassword())) {
			System.out.println("Password is Valid\n");
		}
		else {
			System.out.println("Invalid Password\n");
		}
	}
/**
 * This methods stores multiple Email Id is ArrayList
 * & validates all the Email Id
 * 
 *  @return No return	
 */
	public static void multipleEmailValidator() {
		
		 ArrayList<String> emailList = new ArrayList<>();
		 //valid Email Id
		 emailList.add("abc-100@yahoo.com");
		 emailList.add("abc.100@yahoo.com");
		 emailList.add("abc111@abc.com");
		 emailList.add("abc@yahoo.com");
		 emailList.add("abc-100@abc.net");
		 emailList.add("abc.100@abc.com.au");
		 emailList.add("abc@gmail.com.com");
		 emailList.add("abc+100@gmail.com");
		 //Invalid Email Id
		 emailList.add("abc");
		 emailList.add("abc@.com.my");
		 emailList.add("abc123@gmail.a");
		 emailList.add("abc123@.com");
		 emailList.add("abc123@.com.com");
		 emailList.add(".abc@abc.com");
		 emailList.add("abc()*@gmail.com");
		 emailList.add("abc..2002@gmail.com");
		 emailList.add("abc@%*.com");
		 emailList.add("abc.@gmail.com");
		 emailList.add("abc@abc@gmail.com");
		 emailList.add("abc@gmail.com.1a");
		 emailList.add("abc@gmail.com.aa.au");
		 
		 for (String email : emailList) {
			 
			 boolean flag = service.validateEmailId(email);
			 
			 if(flag) {
				 System.out.println(email + " is Valid Email Id\n");
			 }
			 else {
				 System.out.println(email + " is In-Valid Email Id\n"); 
			 }
		 }
	}
	
	public static void main(String[] args) {
		
		getUserDetails();
		multipleEmailValidator();
	}
}
