package seleniumPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class O1LaunchAppsDriver {



public static void main(String[] args) {
    //1stWay:System.setProperty("webdriver.chrome.driver",System.getProperty("user+dir")+"//src//test//resources//Driver//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    //driver.close();

    //2nd way:WebDriverManager
    WebDriverManager.chromedriver().setup();
    driver.get("https://mvnrepository.com");
    driver.close();


}

}
