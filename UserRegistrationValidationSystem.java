package com.userregistrationproblem;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

interface IUserValidation{
    boolean validateString(String userDetail,Pattern pattern);
}

public class UserRegistrationValidationSystem {

    static IUserValidation validateuser=(userDetail,pattern)->{return pattern.matcher(userDetail).matches();};

    //check first name (Starting with capital and has min 3 characters)
    public static boolean validate_firstName(String firstName) throws UserValidationException {
        try {
            String firstNamePattern = "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
            Pattern pattern = Pattern.compile(firstNamePattern);
            return validateuser.validateString(firstName, pattern);
        } catch (Exception e) {
            throw new UserValidationException("First name starts with capital & contain min 3 characters");
        }
    }

    //check last name (Starting with capital and has min 3 characters)
    public static boolean validate_lastName(String lastName) throws UserValidationException {
        try {
            String lastNamePattern = "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
            Pattern pattern = Pattern.compile(lastNamePattern);
            return validateuser.validateString(lastName, pattern);
        } catch (Exception e) {
            throw new UserValidationException("Last Name should start with capital letters and contain minimum 3 characters");
        }
    }

    //check email-id
    public static boolean validate_email(String email) throws UserValidationException {
        try{
            String emailPattern="^[a-zA-Z]{3}[a-zA-Z0-9\\-\\_\\+]*(\\.)?[a-zA-Z0-9]*(?<!\\.|\\+|\\_|\\-)\\@(?!\\.)[a-z0-9]*(\\.[a-z]{2,3})(\\.[a-z]{2,3})?$";
            Pattern pattern = Pattern.compile(emailPattern);
            return validateuser.validateString(email, pattern);
        } catch (Exception e){
                throw new UserValidationException("Invalid Email ! Please enter Proper email address.");
            }
        }

    //check contact details (Starting with 91,space,10 digits)
    public static boolean validate_contact(String contact) throws UserValidationException {
        try {
            String contactPattern = "^(91)\\s[6-9]{1}[0-9]{9}$";
            Pattern pattern = Pattern.compile(contactPattern);
            return validateuser.validateString(contact, pattern);
        } catch (Exception e) {
            throw new UserValidationException("Invalid Contact ! Please enter 91 followed by space than 10 digit numbers.");
        }
    }

    //check password
    public static boolean validate_password(String password) throws UserValidationException {
        try{
            String passwordPattern="^[a-z]*(?=.*[A-Z])(?=.*\\d)(?=[^\\W]*[\\W][^\\W]*$).{8,}$";
            Pattern pattern = Pattern.compile(passwordPattern);
            return validateuser.validateString(password, pattern);
        } catch (Exception e) {
            throw new UserValidationException("Invalid Password ! Password must contain a capital letter,a digit and single special character.");
        }
    }
}