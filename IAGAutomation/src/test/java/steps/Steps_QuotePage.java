package steps;

import PonchoWebObjects.Poncho_QuotePage;
import com.thoughtworks.gauge.Step;
import drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Steps_QuotePage {

    Poncho_QuotePage New_ponchoQuotePage = new Poncho_QuotePage(Driver.driver);

    @Step("Enter First Name <FirstName>, Last Name <LastName>, Select Start Date <StartDate>")
    public void initiateQuote(String FirstName, String LastName, String StartDate) throws InterruptedException{

        Thread.sleep(5000);

        New_ponchoQuotePage.txtBox_PolicyStartFirstName.sendKeys(FirstName);

        New_ponchoQuotePage.txtBox_PolicyStartLastName.sendKeys(LastName);

        Driver.driver.findElement(By.xpath("//i[contains(@class,'material-icons manual-calendar-toggle')]")).click();

        Thread.sleep(2000);

        New_ponchoQuotePage.txtBox_PolicyStartDate.click();

        System.out.println("Quote Date = " +StartDate);


        for (int i=0; i<10 ; i++) {

            New_ponchoQuotePage.txtBox_PolicyStartDate.sendKeys(Keys.BACK_SPACE);

        }

        Thread.sleep(1000);

        New_ponchoQuotePage.txtBox_PolicyStartDate.sendKeys(StartDate);

        Thread.sleep(1000);

        New_ponchoQuotePage.txtBox_PolicyStartDate.sendKeys(Keys.ENTER);


    }

    @Step("Click Get a Quote Button.")
    public void clickGetaQuoteButton(){

        New_ponchoQuotePage.btn_GetaQuote.click();

    }





}
