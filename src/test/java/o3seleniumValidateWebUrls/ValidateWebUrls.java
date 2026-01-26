package o3seleniumValidateWebUrls;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateWebUrls {
    static WebDriver driver;
    public static void main(String[] args) {
        driver=new ChromeDriver();
     launch("https://codenboxautomationlab.com/");

    }
   public static String launch(String launchurl) {
       if (launchurl == null) {
           throw new RuntimeException("url was null");
       }
       else if (launchurl.indexOf("http") == -1) {
           throw new RuntimeException("http/s was not defined in the url");
       }
       else if (launchurl.startsWith("http") == false)
       {
           throw new RuntimeException("URL is not starting with http");
       }
       else {
           driver.get(launchurl);
           return driver.getWindowHandle();
       }

   }
}
