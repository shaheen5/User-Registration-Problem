package com.userregistrationproblem;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistrationValidationSystem {
    public static Pattern pattern;
    public static Matcher matcher;

    //check first name (Starting with capital and has min 3 characters)
    public static boolean validate_firstName(String firstName) throws UserValidationException {
        String firstNamePattern="^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
        pattern=Pattern.compile(firstNamePattern);
        matcher=pattern.matcher(firstName);
        if(!matcher.matches())
            throw new UserValidationException("First Name should start with capital letters and contain minimum 3 characters");
        else
            return matcher.matches();
    }

    //check last name (Starting with capital and has min 3 characters)
    public static boolean validate_lastName(String lastName) throws UserValidationException {
        String lastNamePattern="^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
        matcher=pattern.matcher(lastName);
        if(!matcher.matches())
            throw new UserValidationException("Last Name should start with capital letters and contain minimum 3 characters");
        else
            return matcher.matches();
    }

    //check email-id
    public static boolean validate_email(String email) throws UserValidationException {
        String emailPattern="^[a-zA-Z]{3}[a-zA-Z0-9\\-\\_\\+]*(\\.)?[a-zA-Z0-9]*(?<!\\.|\\+|\\_|\\-)\\@(?!\\.)[a-z0-9]*(\\.[a-z]{2,3})(\\.[a-z]{2,3})?$";
        pattern=Pattern.compile(emailPattern);
        matcher=pattern.matcher(email);
        if(!matcher.matches())
            throw new UserValidationException("Invalid Email ! Please enter Proper email address.");
        else
            return matcher.matches();
    }

    //check contact details (Starting with 91,space,10 digits)
    public static boolean validate_contact(String contact) throws UserValidationException {
        String contactPattern="^(91)\\s[6-9]{1}[0-9]{9}$";
        pattern=Pattern.compile(contactPattern);
        matcher=pattern.matcher(contact);
        if(!matcher.matches())
            throw new UserValidationException("Invalid Contact ! Please enter 91 followed by space than 10 digit numbers.");
        else
            return matcher.matches();
    }

    //check password
    public static boolean validate_password(String password) throws UserValidationException {
        String passwordPattern="^[a-z]*(?=.*[A-Z])(?=.*\\d)(?=[^\\W]*[\\W][^\\W]*$).{8,}$";
        pattern=Pattern.compile(passwordPattern);
        matcher=pattern.matcher(password);
        if(!matcher.matches())
            throw new UserValidationException("Invalid Password ! Password must contain a capital letter,a digit and single special character.");
        else
            return matcher.matches();
    }
}