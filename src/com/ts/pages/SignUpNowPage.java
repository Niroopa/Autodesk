package com.ts.pages;

import com.ts.base.BasePage;
import com.ts.utils.web.PageDriver;
import org.openqa.selenium.By;

/**
 * Created by Vidhya Kasiviswanathan on 5/5/2016.
 */
public class SignUpNowPage extends BasePage {

    public SignUpNowPage(PageDriver driver) {
        super(driver);

    }

    //Click SignIn Button on top right corner
    public String clickSignIn() {
        driver.findElement("login.loginBtn").click();
        driver.visibilityWait(By.cssSelector(".navbar-btn.btn.btn-success"));
        String currentURL = driver.getCurrentUrl();
        driver.navigateback();
        return currentURL;
    }

    //Click SIGNUP WITH GITHUB button
    public String clickSignUpwithGitHub() {
        driver.findElement("signup.withgithub").click();
        driver.visibilityWait(By.cssSelector(".navbar-btn.btn.btn-success"));
        String currentURL = driver.getCurrentUrl();
        driver.navigateback();
        return currentURL;
    }

    //Click SIGNUP WITH FACEBOOK button
    public String clickSignUpwithFacebook() {
        driver.findElement("signup.withfacebook").click();
        driver.visibilityWait(By.cssSelector(".navbar-btn.btn.btn-success"));
        String currentURL = driver.getCurrentUrl();
        driver.navigateback();
        return currentURL;
    }

    //Click SIGNUP WITH GOOGLE button
    public String clickSignUpwithGoogle() {
        driver.findElement("signup.withgoogle").click();
        driver.visibilityWait(By.cssSelector(".navbar-btn.btn.btn-success"));
        String currentURL = driver.getCurrentUrl();
        driver.navigateback();
        return currentURL;
    }

    //Click SIGNUP WITH LINKEDIN button
    public String clickSignUpwithLinkedIn() {
        driver.findElement("signup.withlinkedin").click();
        driver.visibilityWait(By.cssSelector(".navbar-btn.btn.btn-success"));
        String currentURL = driver.getCurrentUrl();
        driver.navigateback();
        return currentURL;
    }

    //Check if CREATE ACCOUNT button is displayed
    public boolean createAccount() {
        return driver.findElement("id=signup.form").isDisplayed();
    }

    //Check Invalid Email Address error message
    public String invalidEmailAddressFormat(String email) throws Exception {
        driver.findElement("id=signup.email").clear();
        driver.findElement("id=signup.email").sendKeys(email);
        driver.visibilityWait(By.cssSelector("signup.invalidemail"));
        return driver.findElement("signup.invalidemail").getText();
    }

    //Check Email Required error message
    public String backspaceEmailAddress() {
        driver.findElement("id=signup.email").clear();
        driver.findElement("id=signup.email").sendKeys("x");
        driver.findElement("id=signup.email").pressBackspace();
        driver.visibilityWait(By.cssSelector("signup.invalidemail"));
        return driver.findElement("signup.invalidemail").getText();
    }


    //Check Password Must be 8-20 characters error message
    public String invalidPasswordChars(String password) {
        driver.findElement("id=signup.epassword").clear();
        driver.findElement("id=signup.epassword").sendKeys(password);
        return driver.findElement("signup.invalidpwdchars").getText();
    }

    //Check Password Required error message
    public String backspacePassword(String password) {
        driver.findElement("id=signup.epassword").clear();
        driver.findElement("id=signup.epassword").sendKeys(password);
        driver.findElement("id=signup.epassword").pressBackspace();
        return driver.findElement("signup.pwdrequired").getText();
    }

}
