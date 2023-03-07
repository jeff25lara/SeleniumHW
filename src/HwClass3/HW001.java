package HwClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW001 {
    public static void main(String[] args) {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //initiate the instance of webdriver
        WebDriver driver = new ChromeDriver();
        driver.get(" http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();
        WebElement enterMessage = driver.findElement(By.xpath(" //input[contains(@id,'user-message')]"));
        enterMessage.sendKeys("Hello");
        WebElement button = driver.findElement(By.xpath("//button[text()='Show Message']"));
        button.click();
        driver.findElement(By.xpath("//input[contains(@id,'sum1')]")).

                sendKeys("5");
        driver.findElement(By.xpath("//input[contains(@id,'sum2')]")).

                sendKeys("10");
        driver.findElement(By.xpath("//button[text()='Get Total']")).

                click();

        WebElement click=driver.findElement(By.xpath("//button[contains(text(),'Get T')]"));
        click.click();
        WebElement total= driver.findElement(By.xpath("//span[@id='displayvalue']"));
        System.out.println(total.getText());
        }
    }