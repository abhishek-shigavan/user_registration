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
}
