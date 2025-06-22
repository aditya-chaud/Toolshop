package pageObjects.Products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.basePage;

public class productDetailsPage extends basePage {
    public productDetailsPage(WebDriver driver){
        super(driver);
    }
    //locators
    @FindBy(xpath = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
    WebElement viewDetails;
    //Action method
    public String setViewDetails(){
        viewDetails.click();
        return driver.getTitle();
    }
}
