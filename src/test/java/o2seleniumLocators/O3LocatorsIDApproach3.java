package o2seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O3LocatorsIDApproach3 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement user_name=driver.findElement(By.id("username"));
        enterUN(user_name,"admin3");


    }
    public static void  enterUN(WebElement element,String un){
        element.sendKeys(un);
    }


}
