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

    @Test
    public void validateMultipleEmailIdForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateMultipleEmailId("abc@yahoo.com");
        Assert.assertTrue(actualOutput);
        boolean actualOutput1 = userRegistration.validateMultipleEmailId("abc-100@yahoo.com");
        Assert.assertTrue(actualOutput1);
        boolean actualOutput2 = userRegistration.validateMultipleEmailId("abc.100@yahoo.com");
        Assert.assertTrue(actualOutput2);
        boolean actualOutput3 = userRegistration.validateMultipleEmailId("abc111@abc.com");
        Assert.assertTrue(actualOutput3);
        boolean actualOutput4 = userRegistration.validateMultipleEmailId("abc-100@abc.net");
        Assert.assertTrue(actualOutput4);
        boolean actualOutput5 = userRegistration.validateMultipleEmailId("abc@1.com");
        Assert.assertTrue(actualOutput5);
        boolean actualOutput6 = userRegistration.validateMultipleEmailId("abc+100@gmail.com");
        Assert.assertTrue(actualOutput6);
    }

    @Test
    public void validateMultipleEmailIdForNegativeScenarioTest() {
        boolean actualOutput = userRegistration.validateMultipleEmailId("abc");
        Assert.assertFalse(actualOutput);
        boolean actualOutput1 = userRegistration.validateMultipleEmailId("abc@.com.my");
        Assert.assertFalse(actualOutput1);
        boolean actualOutput2 = userRegistration.validateMultipleEmailId("abc123@gmail.a");
        Assert.assertFalse(actualOutput2);
        boolean actualOutput3 = userRegistration.validateMultipleEmailId("abc123@.com");
        Assert.assertFalse(actualOutput3);
        boolean actualOutput4 = userRegistration.validateMultipleEmailId("abc123@.com.com");
        Assert.assertFalse(actualOutput4);
        boolean actualOutput5 = userRegistration.validateMultipleEmailId(".abc@*abc.com");
        Assert.assertFalse(actualOutput5);
        boolean actualOutput6 = userRegistration.validateMultipleEmailId("abc@%*.com");
        Assert.assertFalse(actualOutput6);
        boolean actualOutput7 = userRegistration.validateMultipleEmailId("abc()*@gmail.com.a");
        Assert.assertFalse(actualOutput7);
        boolean actualOutput8 = userRegistration.validateMultipleEmailId("abc@%*.com");
        Assert.assertFalse(actualOutput8);
        boolean actualOutput9 = userRegistration.validateMultipleEmailId("abc..2002@gmail.com-");
        Assert.assertFalse(actualOutput9);
        boolean actualOutput10 = userRegistration.validateMultipleEmailId("abc.@gmail.com-");
        Assert.assertFalse(actualOutput10);
        boolean actualOutput11 = userRegistration.validateMultipleEmailId("abc@abc@gmail.com");
        Assert.assertFalse(actualOutput11);
        boolean actualOutput12 = userRegistration.validateMultipleEmailId("abc@gmail.com.1a");
        Assert.assertFalse(actualOutput12);
        boolean actualOutput13 = userRegistration.validateMultipleEmailId("abc@gmail.com.aa.au");
        Assert.assertFalse(actualOutput13);
    }

}