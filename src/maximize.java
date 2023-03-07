import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {
        //connect to the webdriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //create an instance of webDriver
        WebDriver driver=new ChromeDriver();
        //goto google.com
        driver.get("https://www.google.com");
        //maximize the window
        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
        //close
        driver.close();
    }
}
