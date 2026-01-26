package o5seleniumTakeScreenshot;

import framework.SeleniumUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.nio.file.Files;

public class TakesScreenshott {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
        SeleniumUtils seleniumutils=new SeleniumUtils(driver);
        seleniumutils.launchBrowser("https://www.cricbuzz.com/");
        seleniumutils.checkWhetherWebpageLaunched("Women's Premier League 2026 | Live Cricket Score, Schedule, Latest News, Stats &amp; Videos | Cricbuzz.com");

        By l_scores=By.linkText("Live Scores");
        driver.findElement(l_scores).click();
        //File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //File dest=new File("Sample.png");
        //Files.copy(src,dest);

    }
}
