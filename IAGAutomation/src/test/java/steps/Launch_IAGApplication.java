package steps;


import com.thoughtworks.gauge.Step;
import drivers.Driver;

public class Launch_IAGApplication {



    @Step("Launch IAG Application.")
    public void launchIAGApplication() {
        //System.out.println("Session ID = " +((RemoteWebDriver)driver).getSessionId());

        String url = System.getenv("testURL");



        Driver.driver.manage().window().maximize();

        System.out.println("New URL is = " + url);


        //driver.get(url);
        Driver.driver.get(url);



    }

    @Step("Close Browser")
    public void CloseBrowser() {

        Driver.driver.close();

    }

}
