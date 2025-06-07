package testCases;

import org.testng.annotations.Test;
import pageObjects.SignupLoginPage;
import pageObjects.homePage;
import testBase.baseClass;

public class signUpLoginTest extends baseClass {
    @Test
    public void presignup(){
        homePage hp=new homePage(driver);
        hp.setsignUpLogin();
        SignupLoginPage signup=new SignupLoginPage(driver);
        signup.setSignupName("testad05");
        signup.setSignupEmail("testad05@gmail.com");
    }
}
