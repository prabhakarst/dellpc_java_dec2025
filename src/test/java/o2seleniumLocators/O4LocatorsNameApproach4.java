package o2seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O4LocatorsNameApproach4 {
    static WebDriver driver;
    public static void main(String[] args) {
        driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username_web=driver.findElement(By.id("username"));
       // username_web.sendKeys("admin");
        findWebEelement(username_web,"admin");
        By password_web=By.id("password");
        findWebEelement(password_web,"123");

    }
    public static void findWebEelement(WebElement elt,String enterUN){
        elt.sendKeys(enterUN);

    }
    //Method overloading
    public static void findWebEelement(By by, String keys){
        driver.findElement(by).sendKeys(keys);

    }

}
