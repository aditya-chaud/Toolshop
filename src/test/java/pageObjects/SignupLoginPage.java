package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupLoginPage extends basePage {
    public SignupLoginPage(WebDriver driver){
        super(driver);
    }

    //locators
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement signupName;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement signupEmail;
//    signup click locator and its action


    //Actions
    public void setSignupName(String name){
        signupName.sendKeys(name);
    }
    public void setSignupEmail(String email){
        signupEmail.sendKeys(email);
    }


}
