package testCases.signupLoginT;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.signupLogin.SignupLoginPage;
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

        SignupLoginPage ln=new SignupLoginPage(driver);
        //verify the login page
        Assert.assertEquals(ln.verifyLoginPage(),"Login to your account");
    }
    @Test(priority = 2)
    public void login(){
        homePage hp=new homePage(driver);
        //open homepage and click on signup/login
        hp.setsignUpLogin();

        SignupLoginPage ln=new SignupLoginPage(driver);
        //pass the email n password
        ln.setEmailPass(prop.getProperty("email"), prop.getProperty("password"));
        ln.clicklgnBth();
        Assert.assertEquals(ln.verifyLogin(), "3fQBX");
    }
    @Test(priority=3)
    public void logout(){
        homePage hp=new homePage(driver);
        hp.setsignUpLogin();
        SignupLoginPage ln=new SignupLoginPage(driver);
        ln.setEmailPass(prop.getProperty("email"), prop.getProperty("password"));
        ln.clicklgnBth();
        Assert.assertEquals(ln.logOut(), "Automation Exercise - Signup / Login" );



    }

}
