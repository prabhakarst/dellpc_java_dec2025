package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class O4OpenNewTabAndUtilWindowHandle {
    static WebDriver driver;

    public static void main(String[] args) {
        driver=new ChromeDriver();
        String insta=createTab("https://www.youtube.com/");
        String fk=createTab("https://www.flipkart.com/");
        driver.switchTo().window(insta);
    }
//    public static String winMax(){
//        driver.manage().window().maximize();
//        //return driver.getWindowHandle();
//    }
    public static String createTab(String URL){

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(URL);
        return driver.getWindowHandle();

    }
}
