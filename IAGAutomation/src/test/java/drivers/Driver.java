package drivers;

import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Driver {

    // Holds the WebDriver instance
    public static WebDriver driver;

    // Initialize a driver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the driver
    @BeforeSuite
    public void initializeDriver() {
        driver = DriverFactory.getDriver();
    }

    /*
    // Close the driver instance
    @AfterSuite
    public void closeDriver(){
        driver.close();
    }
*/
}

