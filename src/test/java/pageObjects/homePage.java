package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage {
        public homePage(WebDriver driver){
            super(driver);
        }
        //Locators
        @FindBy(xpath = "//a[normalize-space()='Signup / Login']") WebElement signUpLogin;


        //Action methods
        public void setsignUpLogin(){
            signUpLogin.click();
        }

}
