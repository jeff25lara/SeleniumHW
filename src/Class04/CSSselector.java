package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //initiate the instance of webdriver
        WebDriver driver=new ChromeDriver();
        //open website
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement createNewBtn=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));

        createNewBtn.click();
        // put sleep statement so that the browser can open up the window which contains the element
        Thread.sleep(2000);


        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("abra");



    }
}
