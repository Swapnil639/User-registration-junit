package com.bridgelabz;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Before
    public void setup() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void validateFirstNameForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateFirstName("Swapnil");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateFirstNameForNegativeScenarioTest() {
        boolean actualOutput = userRegistration.validateFirstName("swapnil");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validateLastNameForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateLastName("Patil");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateLastNameForNegativeScenarioTest() {
        boolean actualOutput = userRegistration.validateLastName("patil");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validateEmailIdForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateEmailId("swapnilpatil631997@gmail.com");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateEmailIdForNegativeScenarioTest() {
        boolean actualOutput = userRegistration.validateLastName("swapnil.com");
        Assert.assertFalse(actualOutput);
    }


    @Test
    public void validateMobileNumberForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateMobileNumber("+91 9967891679");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateMobileNumberForNegativeScenarioTest() {
        boolean actualOutput = userRegistration.validateLastName("9967891679");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validatePasswordForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validatePassword("Swapnil639");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validatePasswordForNegativeScenarioTest() {
        boolean actualOutput = userRegistration.validatePassword("swapnil");
        Assert.assertFalse(actualOutput);
    }

}