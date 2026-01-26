package o4seleniumKeysLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysLibrary {
    public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
        driver.get("https://codenboxautomationlab.com/registration-form/");
        WebElement element=driver.findElement(By.name("fname"));
                element.sendKeys("Abhay");

//                mimickKeyboard
        element.sendKeys(Keys.TAB);

        //enter value without locators
        driver.switchTo().activeElement().sendKeys("Sharma");
        //driver.quit();
    }
//public static void mimickKeyboard(String elt){
//        elt.sendKeys(Keys.TAB);
//}

}
