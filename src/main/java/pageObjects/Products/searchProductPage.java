package pageObjects.Products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.basePage;
public class searchProductPage extends basePage{
    public searchProductPage(WebDriver driver){
        super(driver);
    }

    //Locators
    @FindBy(xpath = "//h2[normalize-space()='All Products']") WebElement productPage;
    @FindBy(xpath = "//input[@id='search_product']") WebElement searchText;
    @FindBy(xpath = "//i[@class='fa fa-search']") WebElement search;
    //also verify from url
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']") WebElement searchedConfirmation;

    //Action methods
    public String productPageConfirm(){
        return productPage.getText();
    }
    public void search(String searchtxt){
        searchText.sendKeys(searchtxt);
        search.click();
    }
    public String searchConfirm(){
        return searchedConfirmation.getText();
    }

}
