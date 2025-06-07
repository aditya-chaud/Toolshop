package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.homePage;

import java.time.Duration;

public class homePageTest {
    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void signUPLogin(){
        homePage hp=new homePage(driver);
        hp.setsignUpLogin();

    }
}
