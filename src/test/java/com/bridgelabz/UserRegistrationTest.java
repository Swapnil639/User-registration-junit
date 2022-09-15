package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    static UserRegistration userRegistration = new UserRegistration();

    @Test
    public void positiveFirstNameValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.firstNameValidation("Swapnil"));
    }

    @Test
    public void negativeFirstNameValidationTest() {
        try {
            userRegistration.firstNameValidation("swa");
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }
    }

    @Test
    public void positiveLastNameValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.lastNameValidation("pat"));
    }

    @Test
    public void negativeLastNameValidationTest() {
        try {
            Assert.assertTrue(userRegistration.lastNameValidation("Patil"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }


    }

    @Test
    public void positiveEmailValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.emailValidation("swapnil6086@gmail.com"));
    }

    @Test
    public void negativeEmailValidationTest() {
        try {
            Assert.assertTrue(userRegistration.emailValidation("pat..123@gamil.com"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }
    }

    @Test
    public void positivePhoneNumberValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.phoneNumberValidation("+91 9967891679"));
    }

    @Test
    public void negativePhoneNumberValidationTest() {
        try {
            Assert.assertTrue(userRegistration.phoneNumberValidation("+91 99678"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }
    }

    @Test
    public void positivePassWordValidationTest() throws InvalidInputExceptionError {
        Assert.assertTrue(userRegistration.passwordValidation("Swapnil@6087"));
    }

    @Test
    public void negativePasswordValidationTest() {
        try {
            Assert.assertTrue(userRegistration.passwordValidation("swap@pat1@"));
        } catch (InvalidInputExceptionError e) {
            e.printStackTrace();
        }
    }
}