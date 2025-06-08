package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

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
    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement confirmation;
    //Create select objects for dropdowns
    Select daydropd=new Select(days);
    Select monthdropd=new Select(month);
    Select yeardropd=new Select(year);
    Select countrydropd=new Select(country);

    //Actions Methods
    public void setGender(){
        gender.click();
    }
    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void setDOB(String Day, String Month, String Year){
        daydropd.selectByValue(Day);
        monthdropd.selectByValue(Month);
        yeardropd.selectByValue(Year);
    }

    public void setFirstLastName(String fName, String lName){
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
    }

    //set addresses
    public void setAddress(String country){
        address.sendKeys("balkot");
        countrydropd.selectByValue(country);
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
        return confirmation.getText();
    }






}
