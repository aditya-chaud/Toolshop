package pageObjects.signupLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.basePage;

public class SignupLoginPage extends basePage {
    public SignupLoginPage(WebDriver driver){
        super(driver);
    }

    //locators for signUp
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement signupName;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement signupEmail;
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement signUpbtn;



    //locators for login
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']") WebElement loginTxtConfirmation;
    @FindBy(xpath = "//input[@data-qa='login-email']") WebElement email;
    @FindBy(xpath="//input[@placeholder='Password']") WebElement password;
    @FindBy(xpath="//button[normalize-space()='Login']") WebElement lgnBtn;
    @FindBy(xpath = "//b[normalize-space()='3fQBX']") WebElement loggedInAs;



    //Actions for signup
    public void setSignupName(String name){
        signupName.sendKeys(name);
    }
    public void setSignupEmail(String email){
        signupEmail.sendKeys(email);
    }
    public signUpPage clicksignUpbtn(){
        signUpbtn.click();
        return new signUpPage(driver);
    }

    //Actions for login
    public String verifyLoginPage(){
        return loginTxtConfirmation.getText();
    }

    public void setEmailPass(String eml, String pwd){
        email.sendKeys(eml);
        password.sendKeys(pwd);
    }
    public void clicklgnBth(){
        lgnBtn.click();
    }
    public String verifyLogin(){
        return loggedInAs.getText();
    }


}
