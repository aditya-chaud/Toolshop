package testCases.signupLoginT;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.signupLogin.SignupLoginPage;
import pageObjects.homePage;
import pageObjects.signupLogin.signUpPage;
import testBase.testBase;

public class signUpTest extends testBase {
    String signupEmail;
    String password;
    @Test(priority = 1)
    public void verifySignUp(){

        //open homepage, here driver is declared in parent class testBase as public
        homePage hp=new homePage(driver);
        hp.setsignUpLogin();

        //open loginsignuppage
        SignupLoginPage signup=new SignupLoginPage(driver);

        String signupName=super.generateRandomString();
        signupEmail=signupName+"@gmail.com";

        System.out.println("Signupemail: " + signupEmail);

        signup.setSignupName(signupName);
        signup.setSignupEmail(signupEmail);
//        signup.clicksignUpbtn();


        //open signup/registration page
//        signUpPage reg=new signUpPage(driver);
        //SignupLoginPage class is returning signUpPage object, so signUpPage constructor is called automatically
        signUpPage reg=signup.clicksignUpbtn();

        password=super.generateRandomString();
        System.out.println("Password: " + password);

        //default set for now
        reg.setGender();
        reg.setPassword(password);
        reg.setDOB("14","2","2000");
        reg.setFirstLastName(signupName, signupName);
        reg.setAddress("India");
        reg.clickCreateAcc();

        //Assert to validate the result
        Assert.assertEquals(reg.getAccountCreationMessage(), "ACCOUNT CREATED!", "Account creation failed");
    }

    //delete the created account
    @Test(priority = 2, dependsOnMethods = "verifySignUp")
    public void accDel(){
        homePage hp=new homePage(driver);
        hp.setsignUpLogin();
        SignupLoginPage ln=new SignupLoginPage(driver);
        ln.setEmailPass(signupEmail, password);
        ln.clicklgnBth();
        signUpPage sup=new signUpPage(driver);
        sup.deleteAcc();
        Assert.assertEquals(sup.getAccDelMessage(),"ACCOUNT DELETED!", "Account Deletion failed");
    }

}
