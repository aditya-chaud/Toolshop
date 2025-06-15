package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.testBase;

public class homePageTest extends testBase {
//    @Test
//    public void signUPLogin(){
//        homePage hp=new homePage(driver);
//        hp.setsignUpLogin();
//
//    }
        @Test
        public void verifyHomepageTitle(){
        String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Automation Exercise");
    }
}
