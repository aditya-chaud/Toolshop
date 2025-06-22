package testCases.productsTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Products.searchProductPage;
import pageObjects.homePage;
import testBase.testBase;

public class searchProductTest extends testBase{
    @Test
    public void verifyProductPage(){
        homePage hp= new homePage(driver);
        hp.clickProducts();
        searchProductPage spg=new searchProductPage(driver);
        Assert.assertEquals(spg.productPageConfirm(),"ALL PRODUCTS");
    }
    @Test
    public void verifySearch(){
        String searchtxt="tshirt";
        homePage hp= new homePage(driver);
        hp.clickProducts();
        searchProductPage spg=new searchProductPage(driver);
        spg.search(searchtxt);
//        Assert.assertEquals(spg.searchConfirm(), "SEARCHED PRODUCTS");
        Assert.assertTrue(spg.searchConfirm().contains(searchtxt));
    }

}
