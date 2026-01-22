package o2seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O2LocatorsIDApproach2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement element=driver.findElement(By.id("username"));
        element.sendKeys("admin1");
        Thread.sleep(3000);
        element.sendKeys("admin2");

    }
}
