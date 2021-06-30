package com.userregistration.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * UserRegistrationService -- Defining methods to validate
 * 							  UserRegistration fields.
 * 
 * @author Abhishek Shigavan
 *
 */
public class UserRegistrationService {
/**
 * This method validates First Name
 * 
 * @param first name
 * @return true / false
 */
	public boolean validateFirstName(String f_Name) {
		
		boolean flag = false;
		
        //first letter compulsory capital and 
		//should have minimum 3 letters
        String regexPattern = "^[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regexPattern);

        if (f_Name == null) {
            return flag;
        }

        Matcher match = pattern.matcher(f_Name);

        flag = match.matches();

		return flag;
	}
/**
 * This method validates last name
 * 	
 * @param Last Name
 * @return true / false
 */
	public boolean validateLastName(String l_Name) {
		
		boolean flag = false;
		
		//first letter compulsory capital and 
		//should have minimum 3 letters
        String regexPattern = "^[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regexPattern);

        if (l_Name == null) {
            return flag;
        }

        Matcher match = pattern.matcher(l_Name);

        flag = match.matches();

		return flag;
	}
/**
 * This method validates Email Id
 * 	
 * @param emailId
 * @return true / false
 */
	public boolean validateEmailId(String emailId) {
		
		boolean flag = false;
		
		//Username is compulsory before @ can have Username with ._- in between / without it
		//@ domain name compulsory
		//after domain one tld is compulsory another one is optional
		String regexPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@([a-z0-9]{3,12})\\.([a-z]{2,6})(\\.[a-z]{2,3})?$";
		Pattern pattern = Pattern.compile(regexPattern);

			if (emailId == null) {
	            return flag;
	        }

	        Matcher match = pattern.matcher(emailId);

	        flag = match.matches();

			return flag;
	}
/**
 * This method validates mobile number
 * 	
 * @param mob_No
 * @return true / false
 */
	public boolean validateMobNo(String mob_No) {
        boolean flag = false;

        //country code is optional
        //if given then have to give space after country code
        //mobile no must be 10 digits
        String regexPattern = "(0\s|91\s)?[1-9][0-9]{9}";
        Pattern pattern = Pattern.compile(regexPattern);

        if (mob_No == null) {
            return flag;
        }

        Matcher match = pattern.matcher(mob_No);

        flag = match.matches();

        return flag;
    }
/**
 * This method validates password
 * 
 * @param password
 * @return true / false
 */
	public boolean validatePassword(String password) {
		
		boolean flag = false;
		
		//password contains minimum 8 character
		//At least one lower case character
		//At least one upper case character
		//At least one number
		String regexPattern = "^((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20})$";
        Pattern pattern = Pattern.compile(regexPattern);

        if (password == null) {
            return flag;
        }

        Matcher match = pattern.matcher(password);

        flag = match.matches();
		
		return flag;
	}
	
}
