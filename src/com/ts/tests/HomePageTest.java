package com.ts.tests;

import com.ts.base.BaseWebTest;
import com.ts.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.io.IOException;


/**
 * Created by Vidhya Kasiviswanathan on 5/3/2016.
 */
public class HomePageTest extends BaseWebTest {

    private HomePage _hp;

    @BeforeClass
    public void beforeClass() {
        _hp = new HomePage(driver);
    }

    //DELETE mynote: driver.quit() is in AfterSuite

    @Test(enabled=true, priority = 1, alwaysRun = true)
    public void testLogo() {
        assertEquals(_hp.checkLogo(),"https://talentscreen.io/images/logo.jpg");
    }

    @Test(enabled=true, priority = 1, alwaysRun = true)
    public void testClickSignupNow() throws IOException {
        assertEquals(_hp.clickSignupNow(),"https://talentscreen.io/#/website-pages/home");
    }

    @Test(enabled=true, priority = 1, alwaysRun = true)
    public void testClickLogin() throws IOException {
        assertEquals(_hp.clickLogIn(),"https://talentscreen.io/#/login");
    }

    @Test(enabled=true, priority = 2, alwaysRun = true)
    public void testClickSubjects() throws IOException {
        assertEquals(_hp.clickSubjects(),"https://talentscreen.io/#/website-courses/grid");
    }

    @Test(enabled=true, priority = 2, alwaysRun = true)
    public void testClickCandidate() throws IOException {
        assertEquals(_hp.clickCandidate(),"https://talentscreen.io/#/login");
    }

    @Test(enabled=true, priority = 3, alwaysRun = true)
    public void testFeaturedSubjects() throws IOException {
        assertEquals(_hp.getFeaturedSubjectsText(),"Featured Subjects:Choose from a wide range of technical skills.");
    }

    @Test(enabled=true, priority = 3, dependsOnMethods = "testFeaturedSubjects")
    public void testSubjectsSlider() throws IOException {
        assertEquals(_hp.getSubjectSliderCount(),6);
    }

}
