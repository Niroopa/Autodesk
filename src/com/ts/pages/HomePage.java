package com.ts.pages;

import com.ts.base.BasePage;
import com.ts.utils.web.PageDriver;
import com.ts.utils.web.WBy;
import org.openqa.selenium.By;

import java.io.IOException;

/**
 * Created by Vidhya Kasiviswanathan on 5/3/2016.
 */
public class HomePage extends BasePage {

    public HomePage(PageDriver driver) {
        super(driver);
    }

    //Check TalentScreen logo
    public String checkLogo(){
        return driver.findElement("id=header.logo").getAttribute("src");
    }

    //click Sign Up Now in the center
    public String clickSignupNow() throws IOException {
        driver.findElement("login.signupnowBtn").click();
        driver.waitForLoad();
        String currentURL = driver.getCurrentUrl();
        driver.open("https://talentscreen.io");//Needs to use config.properties:url or .navigateback()
        return currentURL;
    }

    //click Log In button on top right
    public String clickLogIn() throws IOException {
        driver.findElement("login.loginBtn").click();
        driver.waitForLoad();
        String currentURL = driver.getCurrentUrl();
        driver.open("https://talentscreen.io");//Needs to use config.properties:url or .navigateback()
        return currentURL;
    }


    //click Subjects
    public String clickSubjects() throws IOException {
        driver.findElement("link=home.subjects").click();
        try {
            Thread.sleep(500); //Extra sleep to wait for page load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String currentURL = driver.getCurrentUrl();
        driver.open("https://talentscreen.io");//Needs to use config.properties:url or .navigateback()
        return currentURL;
    }

    //click Candidate
    public String clickCandidate() throws IOException {
        driver.findElement("link=home.candidate").click();
        String currentURL = driver.getCurrentUrl();
        driver.open("https://talentscreen.io");//Needs to use config.properties:url or .navigateback()
        return currentURL;
    }

    //Get Featured Subjects Text
    public String getFeaturedSubjectsText() {
        return (driver.findElement("home.subject-text1").getText() + ":" +
                driver.findElement("home.subject-text2").getText());
    }

    //Get number of slider items under Featured Subjects
    public int getSubjectSliderCount() {
        return driver.findElements("home.subject-slider").size();
    }

}
