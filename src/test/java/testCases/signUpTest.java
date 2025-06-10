package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.SignupLoginPage;
import pageObjects.homePage;
import pageObjects.signUpPage;
import testBase.baseClass;

public class signUpTest extends baseClass{
    @Test
    public void verifySignUp(){

        //open homepage
        homePage hp=new homePage(driver);
        hp.setsignUpLogin();

        //open loginsignuppage
        SignupLoginPage signup=new SignupLoginPage(driver);

        String signupName=super.generateRandomString();
        String signupEmail=signupName+"@gmail.com";

        System.out.println("Signupemail: " + signupEmail);

        signup.setSignupName(signupName);
        signup.setSignupEmail(signupEmail);
        signup.clicksignUpbtn();


        //open signup/registration page
        signUpPage reg=new signUpPage(driver);

        String password=super.generateRandomString();
        System.out.println("Password: " + password);

        reg.setGender();
        reg.setPassword(password);
        reg.setDOB("14","2","2000");
        reg.setFirstLastName(signupName, signupName);
        reg.setAddress("India");
        reg.clickCreateAcc();

        //Assert to validate the result
        Assert.assertEquals(reg.getAccountCreationMessage(), "ACCOUNT CREATED!", "Account creation failed");


    }

}
