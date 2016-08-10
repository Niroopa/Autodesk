package com.ts.tests;

import com.ts.base.BaseWebTest;
import com.ts.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.io.IOException;


public class HomePageTest extends BaseWebTest {

    private HomePage _hp;

    @BeforeClass
    public void beforeClass() {
        _hp = new HomePage(driver);
        System.out.println("Inside before class");
    }

   
    @Test(enabled=false, priority = 1, alwaysRun = true)
    public void testLogo() {
        assertEquals(_hp.checkLogo(),"http://static-dc.autodesk.net/etc/designs/v201412151200/autodesk/adsk-design/images/autodesk_header_logo_140x23.png");
    }

    @Test(enabled=true, priority = 1, alwaysRun = true)
    public void testClickSignupNow(){
    	 System.out.println("Inside signup test");
        assertEquals(_hp.clickSignupNow(),"http://www.autodesk.com/");
    }

    @Test(enabled=false, priority = 1, alwaysRun = true)
    public void testClickProducts() throws IOException {
        assertEquals(_hp.clickProducts(),"http://www.autodesk.com/products");
    }

   @Test(enabled=false, priority = 2, alwaysRun = true)
    public void testClickBuy() throws IOException {
        assertEquals(_hp.buyProducts(),"http://www.autodesk.com/store");
    }

    @Test(enabled=false, priority = 2, alwaysRun = true)
    public void testClickFreeTrials() throws IOException {
        assertEquals(_hp.clickFreeTrials(),"http://www.autodesk.com/free-trials");
    }

    @Test(enabled=false, priority = 3, alwaysRun = true)
    public void testFeaturedSubjects() throws IOException {
        assertEquals(_hp.getFeaturedSubjectsText(),"The world is changing.Are you ready?");
    }

}
