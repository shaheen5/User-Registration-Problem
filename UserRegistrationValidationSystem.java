package Java_Regex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistrationValidationSystem {
	public static Pattern pattern;
	public static Matcher matcher;

	//check first name (Starting with capital and has min 3 characters)
	public static void validate_firstName(Scanner userInput){
		System.out.print("\nEnter First Name :");
		String firstName=userInput.nextLine();
		String firstNamePattern="^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
		pattern=Pattern.compile(firstNamePattern);
		matcher=pattern.matcher(firstName);
		if(matcher.matches())
			System.out.println("------- Valid First Name! -------");
		else
			System.out.println("------- Invalid First Name! --------");
	}

	//check last name (Starting with capital and has min 3 characters)
	public static void validate_lastName(Scanner userInput){
		System.out.print("\nEnter Last Name :");
		String lastName=userInput.nextLine();
		String lastNamePattern="^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
		pattern=Pattern.compile(lastNamePattern);
		matcher=pattern.matcher(lastName);
		if(matcher.matches())
			System.out.println("------- Valid Last Name! --------");
		else
			System.out.println("-------- Invalid Last Name! --------");
	}

	//check email-id
	public static void validate_email(Scanner userInput){
		System.out.print("\nEnter Email Id :");
		String email=userInput.nextLine();
		String emailPattern="^[a-zA-Z]{3}[a-zA-Z0-9\\.\\-\\_\\+]*(?<!\\.|\\+|\\_|\\-)\\@[a-z0-9]*(\\.[a-z]{2,3})(\\.[a-z]{2,3})?$";
		pattern=Pattern.compile(emailPattern);
		matcher=pattern.matcher(email);
		if(matcher.matches())
			System.out.println("------- Valid Email-Id! --------");
		else
			System.out.println("-------- Invalid Email-Id! --------");
	}

	//check contact details (Starting with 91,space,10 digits)
	public static void validate_contact(Scanner userInput){
		System.out.print("\nEnter Contact number :");
		String contact=userInput.nextLine();
		String contactPattern="^(91)\\s[6-9]{1}[0-9]{9}$";
		pattern=Pattern.compile(contactPattern);
		matcher=pattern.matcher(contact);
		if(matcher.matches())
			System.out.println("------- Valid Phone Number! --------");
		else
			System.out.println("-------- Invalid Phone Number! --------");
	}
	
	//check password
	public static void validate_password(Scanner userInput){
		System.out.print("\nEnter Password :");
		String password=userInput.nextLine();
		String passwordPattern="^[a-z]*(?=.*[A-Z])(?=.*\\d)(?=[^\\W]*[\\W][^\\W]*$).{8,}$";
		pattern=Pattern.compile(passwordPattern);
		matcher=pattern.matcher(password);
		if(matcher.matches())
			System.out.println("------- Valid Password! --------");
		else
			System.out.println("-------- Invalid Password! --------");
	}
	
	public static void main(String args[]) {
		System.out.println("Welcome to User Registration Validation System!");
		Scanner userInput=new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n****************** OPTIONS ********************\n");
			System.out.println("1]Check First Name\n2]Check Last Name\n3]Check Email\n4]Check Contact\n5]Check Password\n6]Exit");
			System.out.print("Enter your choice :");
			choice=userInput.nextInt();
			userInput.nextLine();
			switch(choice) {
				case 1:validate_firstName(userInput);
				        break;
				case 2:validate_lastName(userInput);
				       break;
				case 3:validate_email(userInput);
				       break;
				case 4:validate_contact(userInput);
				       break;
				case 5:validate_password(userInput);
				       break;
				case 6:System.exit(0);
			}
		}while(choice!=6);
	}
}
