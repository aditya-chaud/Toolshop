package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.SignupLoginPage;
import pageObjects.homePage;
import testBase.testBase;

public class signUpLoginTest extends testBase {

    //To initialize properties
    public signUpLoginTest(){
        super();
    }
    //For signup

   //For Login
    @Test(priority = 1)
    public void verifyLoginPage(){
        homePage hp=new homePage(driver);
        //open homepage and click on signup/login
        hp.setsignUpLogin();

        SignupLoginPage signup=new SignupLoginPage(driver);
        //verify the login page
        Assert.assertEquals(signup.verifyLoginPage(),"Login to your account");
    }
    @Test(priority = 2)
    public void login(){
        homePage hp=new homePage(driver);
        //open homepage and click on signup/login
        hp.setsignUpLogin();

        SignupLoginPage signup=new SignupLoginPage(driver);
        //pass the email n password
        signup.setEmailPass(prop.getProperty("email"), prop.getProperty("password"));
        signup.clicklgnBth();
        Assert.assertEquals(signup.verifyLogin(), "3fQBX");
    }
}
