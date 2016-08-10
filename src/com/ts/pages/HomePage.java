package com.ts.pages;

import com.ts.base.BasePage;
import com.ts.utils.web.PageDriver;
import com.ts.utils.web.WBy;

import org.openqa.selenium.By;

import java.io.IOException;



public class HomePage extends BasePage {

    public HomePage(PageDriver driver) {
        super(driver);
    }

    //Check AutoDesk logo
    public String checkLogo(){
        return driver.findElement("home.header.logo").getAttribute("src");
    }

    //click Sign In 
    public String clickSignupNow(){
    	 System.out.println("Inside signup method1");
    	driver.findElement("link=home.signIn").click();
        driver.waitForLoad();
        System.out.println("Inside signup method2");
        driver.findElement("xpath=signIn.autodesk.Account").click();
        String currentURL = driver.getCurrentUrl();
        driver.open("http://www.autodesk.com/");;//Needs to use config.properties:url or .navigateback()
        return currentURL;
    }

    //click on products
    public String clickProducts() throws IOException {
        driver.findElement("link=products.autodesk").click();
        driver.waitForLoad();
        String currentURL = driver.getCurrentUrl();
        driver.open("http://www.autodesk.com");//Needs to use config.properties:url or .navigateback()
        return currentURL;
    }
    
  //click on Buy
    public String buyProducts() throws IOException {
        driver.findElement("link=buy.autodesk").click();
        driver.waitForLoad();
        String currentURL = driver.getCurrentUrl();
        driver.open("http://www.autodesk.com");//Needs to use config.properties:url or .navigateback()
        return currentURL;
    }


   /* //click Subjects
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
    }*/

   // click FreeTrials
    public String clickFreeTrials() throws IOException {
        driver.findElement("link=free.autodesk").click();
        String currentURL = driver.getCurrentUrl();
        driver.open("https://www.autodesk.com");//Needs to use config.properties:url or .navigateback()
        return currentURL;
    }

   //Get Text from the home page
    public String getFeaturedSubjectsText() {
        return (driver.findElement("home.maintext.autodesk")).getText();
    }

}
