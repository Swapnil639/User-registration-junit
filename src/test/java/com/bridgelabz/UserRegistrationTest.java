package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Before
    public void setup() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void validateFirstNameForPositiveTest() {
        boolean actualOutput = userRegistration.validateFirstName("Swapnil");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateFirstNameForNegativeTest() {
        boolean actualOutput = userRegistration.validateFirstName("swapnil");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validateLastNameForPositiveTest() {
        boolean actualOutput = userRegistration.validateLastName("Patil");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateLastNameForNegativeTest() {
        boolean actualOutput = userRegistration.validateLastName("patil");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validateEmailIdForPositiveTest() {
        boolean actualOutput = userRegistration.validateEmailId("swapnilpatil631997@gmail.com");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateEmailIdForNegativeTest() {
        boolean actualOutput = userRegistration.validateLastName("swapnil.com");
        Assert.assertFalse(actualOutput);
    }


    @Test
    public void validateMobileNumberForPositiveTest() {
        boolean actualOutput = userRegistration.validateMobileNumber("+91 9967891679");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateMobileNumberForNegativeTest() {
        boolean actualOutput = userRegistration.validateLastName("9967891");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validatePasswordForPositiveTest() {
        boolean actualOutput = userRegistration.validatePassword("Swapnil@639");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validatePasswordForNegativeTest() {
        boolean actualOutput = userRegistration.validatePassword("swapnil");
        Assert.assertFalse(actualOutput);
    }

}