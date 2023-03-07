package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW001 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        String title=driver.getTitle();
        System.out.println("the title of the page is " +title);

        driver.close();
    }
}
