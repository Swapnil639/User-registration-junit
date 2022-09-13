package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration;

    @Before
    public void setup() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void validateFirstNameForPositiveTest() {
        boolean actualOutput = userRegistration.validateFirstName("Swapnil");
        Assert.assertTrue(actualOutput);
    }

    @Test(expected = UserRegistrationException.class)
    public void validateFirstNameForNegativeTest() {
        userRegistration.validateFirstName("swapnil");
    }

    @Test
    public void validateLastNameForPositiveTest() {
        boolean actualOutput = userRegistration.validateLastName("Patil");
        Assert.assertTrue(actualOutput);
    }

    @Test(expected = UserRegistrationException.class)
    public void validateLastNameForNegativeTest() {
        userRegistration.validateLastName("patil");
    }

    @Test
    public void validateEmailIdForPositiveTest() {
        boolean actualOutput = userRegistration.validateEmailId("swapnil639@gmail.com");
        Assert.assertTrue(actualOutput);
    }

    @Test(expected = UserRegistrationException.class)
    public void validateEmailIdForNegativeTest() {
        userRegistration.validateEmailId("swapnil.com");
    }


    @Test
    public void validateMobileNumberForPositiveTest() {
        boolean actualOutput = userRegistration.validateMobileNumber("+91 9967891679");
        Assert.assertTrue(actualOutput);
    }

    @Test(expected = UserRegistrationException.class)
    public void validateMobileNumberForNegativeTest() {
        userRegistration.validateLastName("99678");

    }

    @Test
    public void validatePasswordForPositiveTest() {
        boolean actualOutput = userRegistration.validatePassword("Swap@4998");
        Assert.assertTrue(actualOutput);
    }

    @Test(expected = UserRegistrationException.class)
    public void validatePasswordForNegativeTest() {
        userRegistration.validatePassword("swap4998");

    }
}