package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args) {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //initiate the instance of webdriver
        WebDriver driver = new ChromeDriver();
        //open website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        //varify that the title is "web orders"
        String title=driver.getTitle();

        if (title.equalsIgnoreCase("Web Orders")){
        System.out.println("The title is correct");
        }else{
            System.out.println("Title is not correct");

        }
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();


    }
}