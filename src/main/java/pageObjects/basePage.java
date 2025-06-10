package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage {
    WebDriver driver;
    //constructor or initiate driver instance
    public basePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

}
