package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW002 {
    public static void main(String[] args) throws InterruptedException {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //initiate the instance of webdriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Jefferson");
        driver.findElement(By.id("customer.lastName")).sendKeys("Lara");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Fairfax Blvd");
        driver.findElement(By.id("customer.address.city")).sendKeys("Fairfax");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("123456789");
        driver.findElement(By.id("customer.ssn")).sendKeys("987654321");
        driver.findElement(By.id("customer.username")).sendKeys("Tester");
        driver.findElement(By.id("customer.password")).sendKeys("Test");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Test");
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.close();

    }
}