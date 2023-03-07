package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(" http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement maleBtn=driver.findElement(By.cssSelector("input[value='Male']"));
        boolean isEnabledMale=maleBtn.isEnabled();
        System.out.println("the radio button male is enabled "+isEnabledMale);

        boolean isDisplayedMale=maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed "+isDisplayedMale);

        boolean isSelectedMale=maleBtn.isSelected();
        System.out.println("the radio button male is selected "+isSelectedMale);

        if (!isSelectedMale){
            maleBtn.click();
        }
        // check if radio button is selected after the click

        isSelectedMale=maleBtn.isSelected();
        System.out.println("the status of selection is "+isSelectedMale);
    }
}
