package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateFirstName(String firstName) {
        return Pattern.matches("[A-Z][a-z]{3,}", firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches("[A-Z][a-z]{3,}", lastName);
    }

    public boolean validateEmailId(String emailId) {
        return Pattern.matches("[a-z][A-Z a-z 0-9]+[@][a-z]+[.][a-z]{2,}", emailId);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        return Pattern.matches("[+]91 [0-9]{10}", mobileNumber);
    }

    public boolean validatePassword(String password) {
        return Pattern.matches("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}", password);
    }
    public boolean validateMultipleEmailId(String multipleEmailId) {
        return Pattern.matches("[a-z \\d -.]+[@][a-z \\d]+[.][a-z]{3,}", multipleEmailId);
    }
}