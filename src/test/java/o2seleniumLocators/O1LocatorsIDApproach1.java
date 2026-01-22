package o2seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class O1LocatorsIDApproach1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(3000);
        driver.findElement(By.id("submit")).click();

    }
}
