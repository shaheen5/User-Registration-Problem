package Java_Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistrationValidationSystem {
	public static Pattern pattern;
	public static Matcher matcher;
	
	//check first name (Starting with capital and has min 3 characters)
	public static boolean validate_firstName(String firstName){
		String firstNamePattern="^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
		pattern=Pattern.compile(firstNamePattern);
		return pattern.matcher(firstName).matches();
	}

	//check last name (Starting with capital and has min 3 characters)
	public static boolean validate_lastName(String lastName){
		String lastNamePattern="^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
		pattern=Pattern.compile(lastNamePattern);
		return pattern.matcher(lastName).matches();
	}

	//check email-id
	public static boolean validate_email(String email){
		String emailPattern="^[a-zA-Z]{3}[a-zA-Z0-9\\-\\_\\+]*(\\.)?[a-zA-Z0-9]*(?<!\\.|\\+|\\_|\\-)\\@(?!\\.)[a-z0-9]*(\\.[a-z]{2,3})(\\.[a-z]{2,3})?$";
		pattern=Pattern.compile(emailPattern);
		return pattern.matcher(email).matches();
	}

	//check contact details (Starting with 91,space,10 digits)
	public static boolean validate_contact(String contact){
		String contactPattern="^(91)\\s[6-9]{1}[0-9]{9}$";
		pattern=Pattern.compile(contactPattern);
		return pattern.matcher(contact).matches();
	}
	
	//check password
	public static boolean validate_password(String password){
		String passwordPattern="^[a-z]*(?=.*[A-Z])(?=.*\\d)(?=[^\\W]*[\\W][^\\W]*$).{8,}$";
		pattern=Pattern.compile(passwordPattern);
		return pattern.matcher(password).matches();
	}
}
