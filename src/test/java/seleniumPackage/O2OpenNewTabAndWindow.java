package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class O2OpenNewTabAndWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.flipkart.com/");
        String fkhandle=driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);



        driver.get("https://www.amazon.in/");
        String amazhandle=driver.getWindowHandle();
        Thread.sleep(3000);
        driver.switchTo().window(fkhandle);


        //driver.switchTo().newWindow(WindowType.TAB);
        //driver.get("https://grok.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://mvnrepository.com/");

//driver.close();
    }
}
