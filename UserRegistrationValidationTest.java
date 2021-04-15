package Java_Regex;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationValidationTest {

	@Test
	void givenFirstName_WhenProper_ReturnTrue() {
		boolean result=UserRegistrationValidationSystem.validate_firstName("Shaheen");
		Assert.assertTrue(result);
	}
	
	@Test
	void givenFirstName_WhenShort_ReturnFalse() {
		boolean result=UserRegistrationValidationSystem.validate_firstName("Sa");
		Assert.assertFalse(result);
	}
	
	@Test
	void givenlastName_WhenProper_ReturnTrue() {
		boolean result=UserRegistrationValidationSystem.validate_lastName("Miya");
		Assert.assertTrue(result);
	}
	
	@Test
	void givenlastName_WhenContainsSpecialCharacters_ReturnFalse() {
		boolean result=UserRegistrationValidationSystem.validate_lastName("miya@");
		Assert.assertFalse(result);
	}
	
	@Test
	void givenEmail_WhenValid_ReturnTrue() {
		boolean result=UserRegistrationValidationSystem.validate_email("Shaheen123@gmail.com");
		Assert.assertTrue(result);
	}
	
	@Test
	void givenEmail_WhenInvalid_ReturnFalse() {
		boolean result=UserRegistrationValidationSystem.validate_email("Shaheen..@gmail.com");
		Assert.assertFalse(result);
	}
	
	@Test
	void givenContact_WhenProper_ReturnTrue() {
		boolean result=UserRegistrationValidationSystem.validate_contact("91 9922123445");
		Assert.assertTrue(result);
	}
	
	@Test
	void givenContact_WhenNotProper_ReturnFalse() {
		boolean result=UserRegistrationValidationSystem.validate_contact("1234567890");
		Assert.assertFalse(result);
	}
	
	@Test
	void givenPassword_WhenProper_ReturnTrue() {
		boolean result=UserRegistrationValidationSystem.validate_password("Shaheen@123");
		Assert.assertTrue(result);
	}
	
	@Test
	void givenPassword_WhenHasMoreThanOneSpecialCharacters_ReturnFalse() {
		boolean result=UserRegistrationValidationSystem.validate_password("Qwerty@123.com");
		Assert.assertFalse(result);
	}

}