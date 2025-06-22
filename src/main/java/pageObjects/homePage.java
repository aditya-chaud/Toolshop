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
//        @FindBy(xpath = "//a[normalize-space()='Delete Account']") WebElement delAcc;
//        @FindBy(xpath = "//b[normalize-space()='Account Deleted!']") WebElement delAccConfirmation;




        //Action methods
        public void setsignUpLogin(){
            signUpLogin.click();
        }

        //delete account
//        public void deleteAcc(){
//            delAcc.click();
//        }
//        public String getAccDelMessage() {
//            return delAccConfirmation.getText();
//            //
//        }

}
