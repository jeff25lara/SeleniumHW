package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW003 {
    public static void main(String[] args) {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //initiate the instance of webdriver
        WebDriver driver = new ChromeDriver();
        //open facebook.com
        driver.get("https://www.facebook.com/");
        driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
        driver.findElement(By.name("firstname")).sendKeys("Jefferson");
        driver.findElement(By.name("lastname")).sendKeys("Lara");
        driver.findElement(By.name("reg_email__")).sendKeys("Tester@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Test");
        driver.findElement(By.name("birthday_month")).sendKeys("November");
        driver.findElement(By.name("birthday_day")).sendKeys("25");
        driver.findElement(By.name("birthday_year")).sendKeys("1989");
        driver.findElement(By.id("sex")).sendKeys("Male");
        driver.findElement(By.name("birthday_year")).sendKeys("1989");
        driver.findElement(By.name("birthday_year")).sendKeys("1989");







    }
}