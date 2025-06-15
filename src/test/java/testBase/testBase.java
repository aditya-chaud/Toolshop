package testBase;

import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class testBase {
    public WebDriver driver;
    public Properties prop;
    //this testBase constructor is called for each testcase if the testcase extends the testBase class, even if testBase object is not created.
//    TestNG sees @Test method → needs to run it.
//    TestNG creates object of testcase class.
//    Java calls testBase() constructor (because of inheritance).
    public testBase(){
        try{
            prop=new Properties();
            FileInputStream ip=new FileInputStream("/home/aditya/IdeaProjects/Toolshop/src/main/java/config/properties");
            prop.load(ip);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get(prop.getProperty("url"));
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
