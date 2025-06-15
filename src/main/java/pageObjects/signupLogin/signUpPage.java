package pageObjects.signupLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pageObjects.basePage;

public class signUpPage extends basePage {
    public signUpPage(WebDriver driver){
        super(driver);
    }

    //locators
    @FindBy(xpath = "//input[@id='id_gender1']") WebElement gender;
    @FindBy(xpath = "//input[@id='password']") WebElement password;
    @FindBy(xpath = "//select[@id='days']") WebElement days;
    @FindBy(xpath = "//select[@id='months']") WebElement month;
    @FindBy(xpath = "//select[@id='years']") WebElement year;
    @FindBy(xpath = "//input[@id='first_name']") WebElement firstName;
    @FindBy(xpath = "//input[@id='last_name']") WebElement lastName;
//    @FindBy(xpath = "//input[@id='company']")
//    WebElement company;
    @FindBy(xpath = "//input[@id='address1']") WebElement address;
//    @FindBy(xpath = "//input[@id='address2']")
//    WebElement address2;
    @FindBy(xpath = "//select[@id='country']") WebElement country;
    @FindBy(xpath = "//input[@id='state']") WebElement state;
    @FindBy(xpath = "//input[@id='city']") WebElement city;
    @FindBy(xpath = "//input[@id='zipcode']") WebElement zipcode;
    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement mobileNumber;
    @FindBy(xpath = "//button[normalize-space()='Create Account']") WebElement btnCreateAcc;
    @FindBy(xpath = "//b[normalize-space()='Account Created!']") WebElement accCreationConfirmation;
    @FindBy(xpath = "//a[normalize-space()='Delete Account']") WebElement delAcc;
    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']") WebElement delAccConfirmation;

    //Actions Methods
    public void setGender(){
        gender.click();
    }
    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void setDOB(String Day, String Month, String Year){
        new Select(days).selectByValue(Day);
        new Select(month).selectByValue(Month);
        new Select(year).selectByValue(Year);
    }

    public void setFirstLastName(String fName, String lName){
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
    }

    //set addresses
    public void setAddress(String ctry){
        address.sendKeys("balkot");
        new Select(country).selectByValue(ctry);
        state.sendKeys("Bagmati");
        city.sendKeys("KTM");
        zipcode.sendKeys("01221");
        mobileNumber.sendKeys("9823829283");
    }

    //Create acc
    public void clickCreateAcc(){
        btnCreateAcc.click();
    }

    //confirmation
    public String getAccountCreationMessage() {
        return accCreationConfirmation.getText();
    }

//    //delete account
    public void deleteAcc(){
        delAcc.click();
    }
    public String getAccDelMessage(){
        return delAccConfirmation.getText();
    }



}
