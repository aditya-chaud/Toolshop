package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().window().maximize();
        Thread.sleep(4000);

//        WebElement txtSearch=driver.findElement(By.xpath("//input[@id='search-query']"));
//        WebElement btnSearch=driver.findElement(By.xpath("//button[normalize-space()='Search']"));
//        txtSearch.sendKeys("Pliers");
//        btnSearch.click();
//        Thread.sleep(3000);
//        WebElement sign=driver.findElement(By.xpath("//a[normalize-space()='Categories']"));
//        sign.click();
        WebElement btnSign=driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        btnSign.click();
        WebElement txtUsername=driver.findElement(By.xpath("//input[@placeholder='Name']"));
        WebElement txtMail=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        WebElement signup=driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
        txtUsername.sendKeys("12345");
        txtMail.sendKeys("12345@gmail.com");
        signup.click();
    }
}