package Java_Regex;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

    @RunWith(Parameterized.class)
    public class UserEmailValidationTest {
        private String user_email;
        private boolean expectedResult;

        public UserEmailValidationTest(String user_email, boolean expectedResult) {
            this.user_email = user_email;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> input(){
            return Arrays.asList(new Object[][] {
            	{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc123@.com",false},
            	{".abc@abc.com",false},{"abc111@yahoo.com",true},{"abc123@gmail.a",false},
                {"abc()*@yahoo.in",false},{"abc.100@abc.com.au",true},{"abc+100@gmail.com",true},{"abc-",false},
                {"abc@gmail.com.au.bu",false},{"abc@yahoo.in.1a",false},{"abc@*%.com",false},{"abc@gmail.com.com",true},
                {"abc@1.com",true},{"abc..20002@gmail.com",false},{"abc@abc@gmail.com",false}
            });
        }

        @Test
        public void EmailValidationtest() {
            System.out.println(user_email+" : "+expectedResult);
            boolean result=UserRegistrationValidationSystem.validate_email(user_email);
            Assert.assertEquals(expectedResult, result);
        }
    }
