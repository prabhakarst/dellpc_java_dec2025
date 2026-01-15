package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

//static vars and methods can be used inside static methods only
public class O3OpenNewTabAndWindowUtils {
    //static var
    static WebDriver driver;
    public static void main(String[] args) {
       driver=new ChromeDriver();
        maximizeWin();
       launchURL("https://mvnrepository.com/");
       createNewTab("https://grok.com");
       launchNewWindows("https://www.youtube.com/");

    }
    //static method
    public static void launchURL(String URL){
        driver.get(URL);
    }
    public static void maximizeWin(){
        driver.manage().window().maximize();
    }
    public static void createNewTab(String newTabURL){
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(newTabURL);
    }
    public static void launchNewWindows(String newWinURL){
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(newWinURL);
    }

}
