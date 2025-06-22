package testCases.productsTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Products.productDetailsPage;
import pageObjects.homePage;
import testBase.testBase;
public class productDetailsTest extends testBase{
    @Test
    public void verifyProductDetails(){
        homePage hp= new homePage(driver);
        hp.clickProducts();
        productDetailsPage pdp=new productDetailsPage(driver);
        Assert.assertTrue(pdp.setViewDetails().contains("Product Details"));
    }
}
