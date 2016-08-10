package com.ts.pages;

import com.ts.base.BasePage;
import com.ts.utils.web.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



public class SignUpNowPage extends BasePage {

    public SignUpNowPage(PageDriver driver) {
        super(driver);

    }

 /*   //Click SignIn Button on top right corner
    public String clickSignIn() {
        driver.findElement("login.loginBtn").click();
        driver.visibilityWait("login.signupBtn");
        String currentURL = driver.getCurrentUrl();
        driver.navigateback();
        return currentURL;
    }

    //Click SIGNUP WITH GITHUB button
    public String clickSignUpwithGitHub() {
        driver.findElement("signup.withgithub").click();
        driver.visibilityWait("login.signupBtn");
        String currentURL = driver.getCurrentUrl();
        driver.navigateback();
        return currentURL;
    }

    //Click SIGNUP WITH FACEBOOK button
    public String clickSignUpwithFacebook() {
        driver.findElement("signup.withfacebook").click();
        driver.visibilityWait("login.signupBtn");
        String currentURL = driver.getCurrentUrl();
        driver.navigateback();
        return currentURL;
    }

    //Click SIGNUP WITH GOOGLE button
    public String clickSignUpwithGoogle() {
        driver.findElement("signup.withgoogle").click();
        driver.visibilityWait("login.signupBtn");
        String currentURL = driver.getCurrentUrl();
        driver.navigateback();
        return currentURL;
    }

    //Click SIGNUP WITH LINKEDIN button
    public String clickSignUpwithLinkedIn() {
        driver.findElement("signup.withlinkedin").click();
        driver.visibilityWait("login.signupBtn");
        String currentURL = driver.getCurrentUrl();
        driver.navigateback();
        return currentURL;
    }

    //Check if CREATE ACCOUNT button is displayed
    public boolean createAccount() {
        return driver.findElement("id=signup.form").isDisplayed();
    }

    //Check Invalid Email Address error message
    public String invalidEmailAddressFormat(String email) {
        driver.findElement("id=signup.email").clear();
        driver.findElement("id=signup.email").sendKeys(email);
        driver.visibilityWait("signup.invaliddetails");
        return driver.findElement("signup.invaliddetails").getText();
    }

    //Check Email Required error message
    public String backspaceEmailAddress() {
        driver.findElement("id=signup.email").clear();
        driver.findElement("id=signup.email").sendKeys("x");
        driver.findElement("id=signup.email").pressBackspace();
        driver.visibilityWait("signup.invaliddetails");
        return driver.findElement("signup.invaliddetails").getText();
    }


    //Check Password Must be 8-20 characters error message
    public String invalidPasswordChars(String password) {
        driver.findElement("id=signup.email").clear();
        driver.findElement("id=signup.email").sendKeys("abc@gmail.com");
        driver.findElement("id=signup.epassword").clear();
        driver.findElement("id=signup.epassword").sendKeys(password);
        driver.visibilityWait("signup.invaliddetails");
        return driver.findElement("signup.invaliddetails").getText();
    }

    //Check Password Required error message
    public String backspacePassword(String password) {
        driver.findElement("id=signup.email").clear();
        driver.findElement("id=signup.email").sendKeys("abc@gmail.com");
        driver.findElement("id=signup.epassword").clear();
        driver.findElement("id=signup.epassword").sendKeys(password);
        driver.findElement("id=signup.epassword").pressBackspace();
        driver.visibilityWait("signup.invaliddetails");
        return driver.findElement("signup.invaliddetails").getText();
    }

    //Check Password criteria
    public String invalidPassword(String password) {
        driver.findElement("id=signup.email").clear();
        driver.findElement("id=signup.email").sendKeys("abc@gmail.com");
        driver.findElement("id=signup.epassword").clear();
        driver.findElement("id=signup.epassword").sendKeys(password);
        driver.visibilityWait("signup.invaliddetails");
        return driver.findElement("signup.invaliddetails").getText();
    }

    //Check Confirmation Password don't match
    public String confirmPasswordsDontMatch(String password) {
        driver.findElement("id=signup.email").clear();
        driver.findElement("id=signup.email").sendKeys("abc@gmail.com");
        driver.findElement("id=signup.epassword").clear();
        driver.findElement("id=signup.epassword").sendKeys("Abc12345");
        driver.findElement("id=signup.mpassword").clear();
        driver.findElement("id=signup.mpassword").sendKeys(password);
        driver.visibilityWait("signup.invaliddetails");
        return driver.findElement("signup.invaliddetails").getText();
    }

    //Check Confirmation Password Required
    public String backspaceConfirmPassword(String password) {
        driver.findElement("id=signup.email").clear();
        driver.findElement("id=signup.email").sendKeys("abc@gmail.com");
        driver.findElement("id=signup.epassword").clear();
        driver.findElement("id=signup.epassword").sendKeys("Abc12345");
        driver.findElement("id=signup.mpassword").clear();
        driver.findElement("id=signup.mpassword").sendKeys(password);
        driver.findElement("id=signup.mpassword").pressBackspace();
        driver.visibilityWait("signup.invaliddetails");
        return driver.findElement("signup.invaliddetails").getText();
    }

    //Success Create Account
    //CREATE AN ACCOUNT button is currently not working
    //Once it works, need to update test for email address already exists scenario
    public String createAccountSuccess() {
        driver.findElement("id=signup.email").clear();
        driver.findElement("id=signup.email").sendKeys("abc@gmail.com");
        driver.findElement("id=signup.epassword").clear();
        driver.findElement("id=signup.epassword").sendKeys("Abc12345");
        driver.findElement("id=signup.mpassword").clear();
        driver.findElement("id=signup.mpassword").sendKeys("Abc12345");
        driver.findElement("signup.createaccountbtn").click();
        return driver.getCurrentUrl();
    }
*/


}
