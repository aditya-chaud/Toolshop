package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signUpPage extends basePage {
    public signUpPage(WebDriver driver){
        super(driver);
    }

    //locators
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement gender;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//select[@id='days']")
    WebElement days;
    @FindBy(xpath = "//select[@id='months']")
    WebElement month;
    @FindBy(xpath = "//select[@id='years']")
    WebElement year;
    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastName;
//    @FindBy(xpath = "//input[@id='company']")
//    WebElement company;
    @FindBy(xpath = "//input[@id='address1']")
    WebElement address;
//    @FindBy(xpath = "//input[@id='address2']")
//    WebElement address2;
    @FindBy(xpath = "//select[@id='country']")
    WebElement country;
    @FindBy(xpath = "//input[@id='state']")
    WebElement state;
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement zipcode;
    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement mobileNumber;
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement btnCreateAcc;

    //Actions
    public void setGender(){
        gender.click();
    }
    public void setPassword(){
        password.sendKeys("dfs");
    }




}
