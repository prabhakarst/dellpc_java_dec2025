package o1seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class O5OpenMultipleTabAndWinHandles {
    static WebDriver driver;
    public static void main(String[] args) {
driver=new ChromeDriver();
launchBrowser("https://www.instagram.com/");
        maximize();
createNewTab("https://www.facebook.com/");

//getWindowHandles

        Set<String>windows=driver.getWindowHandles();

        for(String s: windows){
        driver.switchTo().window(s);
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
           if (driver.getTitle().contains("Instagram")) {
               driver.close();
           }
        }
        driver.quit();
    }
    public static void maximize() {
        driver.manage().window().maximize();
    }

    public static String launchBrowser(String url){
        driver.get(url);
        return driver.getWindowHandle();

    }
    public static String createNewTab(String create_tab_url){
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(create_tab_url);
        return driver.getWindowHandle();
    }
    public static String newWindows(String newWinUrl){
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(newWinUrl);
        return driver.getWindowHandle();
    }

}

