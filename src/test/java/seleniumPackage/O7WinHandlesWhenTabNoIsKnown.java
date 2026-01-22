package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class O7WinHandlesWhenTabNoIsKnown {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver=new ChromeDriver();
        O6UtilForWinHandles.sum(1,2);
        launchBrowser("https://www.flipkart.com/");
        createT("https://www.google.com/");
List<String> listToWinHandles=driver.getWindowHandles().stream().collect(Collectors.toList());
Thread.sleep(5000);
    driver.switchTo().window(listToWinHandles.get(1));


    }
    public static String launchBrowser(String lb){
        driver.get(lb);
        return driver.getWindowHandle();

    }

public static String createT(String ct){
        driver.switchTo().newWindow(WindowType.TAB);
driver.get(ct);
return driver.getWindowHandle();
}
}
