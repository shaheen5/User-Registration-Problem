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
			System.out.println("Valid First Name !");
		else
			System.out.println("Invalid First Name !");
		
	}
	
	public static void main(String args[]) {
		System.out.println("Welcome to User Registration Validation System!");
		Scanner userInput=new Scanner(System.in);
		validate_firstName(userInput);
	}
	
	
}
