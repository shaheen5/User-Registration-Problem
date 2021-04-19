package com.userregistrationproblem;
import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationValidationTest {
    @Test
    public void givenFirstName_WhenProper_ReturnTrue() {
        try {
            boolean result=UserRegistrationValidationSystem.validate_firstName("Shaheen");
            Assert.assertEquals(true,result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenFirstName_WhenShort_ReturnFalse() {
        try {
            UserRegistrationValidationSystem.validate_firstName("Sa");
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenlastName_WhenProper_ReturnTrue()  {
        try {
            boolean result = UserRegistrationValidationSystem.validate_lastName("Miya");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenlastName_WhenContainsSpecialCharacters_ReturnFalse()  {
        try {
            UserRegistrationValidationSystem.validate_lastName("miya@");
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmail_WhenValid_ReturnTrue()  {
        try {
            boolean result = UserRegistrationValidationSystem.validate_email("Shaheen123@gmail.com");
            Assert.assertTrue(result);
        }catch(UserValidationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmail_WhenInvalid_ReturnFalse()  {
        try {
            UserRegistrationValidationSystem.validate_email("Shaheen..@gmail.com");
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenContact_WhenProper_ReturnTrue()  {
        try {
            boolean result = UserRegistrationValidationSystem.validate_contact("91 9922123445");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenContact_WhenNotProper_ReturnFalse()  {
        try {
            UserRegistrationValidationSystem.validate_contact("1234567890");
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenProper_ReturnTrue() {
        try {
            boolean result = UserRegistrationValidationSystem.validate_password("Shaheen@123");
            Assert.assertTrue(result);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenHasMoreThanOneSpecialCharacters_ReturnFalse() {
        try {
            UserRegistrationValidationSystem.validate_password("Qwerty@123.com");
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
}