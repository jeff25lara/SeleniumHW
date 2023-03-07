package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //initiate the instance of webdriver
        WebDriver driver=new ChromeDriver();
        //open facebook.com
        driver.get("https://www.facebook.com/");
        //send in the username
        driver.findElement(By.id("email")).sendKeys("jefferson");
        //send the password
        driver.findElement(By.name("pass")).sendKeys("123");
        //click on create new account
//      driver.findElement(By.linkText("Create new account")).click();
        //click on forgotten password
        driver.findElement(By.partialLinkText("password?")).click();
        //close browser
        driver.quit();
    }

}
