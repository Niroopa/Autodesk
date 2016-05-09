package com.ts.tests;

import com.ts.base.BaseWebTest;
import com.ts.pages.HomePage;
import com.ts.pages.SignUpNowPage;
import com.ts.utils.ExcelUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Vidhya Kasiviswanathan on 5/5/2016.
 */
public class SignUpNowTest extends BaseWebTest {

    private SignUpNowPage _sp;

    @BeforeClass
    public void beforeClass() {
        _sp = new SignUpNowPage(driver);
        //mynote: The following button does not work, use open(url) until it is fixed.
        //driver.findElement("login.signupnowBtn").click();
        driver.open("https://talentscreen.io/#/sign-up");
        driver.waitForLoad();
    }
    //DELETE mynote: driver.quit() is in AfterSuite

    @Test (enabled=false, priority = 1)
    public void testClickSignIn() {
        assertEquals(_sp.clickSignIn(),"https://talentscreen.io/#/login");
    }

    @Test (enabled=false, priority = 1)
    public void testClickSignUpwithGitHub() {
        assertEquals(_sp.clickSignUpwithGitHub(),"https://talentscreen.io/#/login");
    }

    @Test (enabled=false, priority = 1)
    public void testClickSignUpwithFacebook() {
        assertEquals(_sp.clickSignUpwithFacebook(),"https://talentscreen.io/#/login");
    }

    @Test (enabled=false, priority = 1)
    public void testClickSignUpwithGoogle() {
        assertEquals(_sp.clickSignUpwithGoogle(),"https://talentscreen.io/#/login");
    }

    @Test (enabled=false, priority = 1)
    public void testClickSignUpwithLinkedIn() {
        assertEquals(_sp.clickSignUpwithLinkedIn(),"https://talentscreen.io/#/login");
    }

    @Test(enabled=true, priority = 1)
    public void testCreateAccount() {
        assertEquals(_sp.createAccount(), true);
    }

    @DataProvider(name="signup-email")
    public Object[][] getEmails() {
        ExcelUtils excelUtils = new ExcelUtils();
        Object[][] data = new Object[0][];
        try {
            data = excelUtils.getSimpleExcelData("web-data.xlsx", "invalidEmail");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @DataProvider(name="signup-invalidpasswordchars")
    public Object[][] getPassword1() {
        ExcelUtils excelUtils = new ExcelUtils();
        Object[][] data = new Object[0][];
        try {
            data = excelUtils.getSimpleExcelData("web-data.xlsx", "invalidPassword1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @DataProvider(name="signup-invalidpassword")
    public Object[][] getPassword2() {
        ExcelUtils excelUtils = new ExcelUtils();
        Object[][] data = new Object[0][];
        try {
            data = excelUtils.getSimpleExcelData("web-data.xlsx", "invalidPassword2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @DataProvider(name="signup-backspacepassword")
    public Object[][] getPassword3() {
        ExcelUtils excelUtils = new ExcelUtils();
        Object[][] data = new Object[0][];
        try {
            data = excelUtils.getSimpleExcelData("web-data.xlsx", "invalidPassword3");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @Test(enabled=true, priority = 1, dependsOnMethods = "testCreateAccount", dataProvider = "signup-email")
    public void testInvalidEmailAddressFormat(String email, String error) {
        assertEquals(_sp.invalidEmailAddressFormat(email), error);
    }

    @Test(enabled=true, priority = 1, dependsOnMethods = "testCreateAccount")
    public void testBackspaceEmailAddress() {
        assertEquals(_sp.backspaceEmailAddress(),"Email Required");
    }

    @Test(enabled=true, priority = 1, dependsOnMethods = "testCreateAccount", dataProvider = "signup-invalidpasswordchars")
    public void testInvalidPasswordChars(String password, String error){
        assertEquals(_sp.invalidPasswordChars(password), error);
    }

    @Test(enabled=false, priority = 1, dependsOnMethods = "testCreateAccount", dataProvider = "signup-backspacepassword")
    public void testBackspacePassword(String password, String error){
        assertEquals(_sp.backspacePassword(password), error);
    }

}

