package testBase;

import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class baseClass {
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
    public String generateRandomString(){
        String genString= RandomString.make(5);
//        System.out.println(genString);
        return genString;
    }
}
