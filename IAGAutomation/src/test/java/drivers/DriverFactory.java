package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverFactory {

    public static WebDriver getDriver() {

        //return driver;

        String browser = System.getenv("BROWSER");
        System.out.println("Browser in default property is = " +browser);

        if (browser == null) {
            //return new FirefoxDriver();
            System.setProperty("webdriver.chrome.driver", "C://Users//srawat//Desktop//Setup//chromedriver.exe");
            return new ChromeDriver();

        }
        switch (browser)
        {
            case "IE":
                return new InternetExplorerDriver();
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "C://Users//srawat//Desktop//Setup//driver//chromedriver.exe");
                return new ChromeDriver();
            default:
                return new FirefoxDriver();
        }


    }

    /*

    @AfterSpec
    public void tearDown() {
        driver.close();
        driver.quit();
    }
*/

}
