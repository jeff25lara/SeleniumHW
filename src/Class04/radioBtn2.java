package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioBtn2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        //find all the age group radio button
        //the xpath here is common to all the WebElements that have ageGroup
        List<WebElement> radioBtns= driver.findElements(By.xpath("//input[@name='ageGroup']"));

        for(WebElement radioBtn:radioBtns){
            String age= radioBtn.getAttribute("value");
            if (age.equalsIgnoreCase("5-15")){
                radioBtn.click();
            }
        }
    }
}