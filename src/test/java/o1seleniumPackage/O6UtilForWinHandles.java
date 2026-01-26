package o1seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class O6UtilForWinHandles {
    static WebDriver driver;

    public static void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        driver = new ChromeDriver();
        maximizeWin();
        launchBrowser("https://support.google.com/chrome?p=help&ctx=settings");
        createNewTab("https://www.google.com");
        SwitchToEachTab();

    }

    public static void maximizeWin() {
        driver.manage().window().maximize();
    }

    public static String launchBrowser(String lb) {
        driver.get(lb);
        return driver.getWindowHandle();
    }

    public static String createNewTab(String url) {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url);
        return driver.getWindowHandle();
    }

    public static void SwitchToEachTab() {
        Set<String> window = driver.getWindowHandles();
        for (String s : window) {
            driver.switchTo().window(s);
        }

    }
}


