package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask {
    public static void main(String[] args) {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //initiate the instance of webdriver
        WebDriver driver=new ChromeDriver();
        //open website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximize screen
        driver.manage().window().maximize();
        //send the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        //click on login button
        driver.findElement(By.className("button")).click();
    }
}
