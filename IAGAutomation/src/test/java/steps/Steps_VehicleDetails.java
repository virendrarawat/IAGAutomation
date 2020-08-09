package steps;

import PonchoWebObjects.Poncho_QuotePage;
import com.thoughtworks.gauge.Step;
import drivers.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Steps_VehicleDetails {

    Poncho_QuotePage New_ponchoQuotePage = new Poncho_QuotePage(Driver.driver);

    @Step("Enter Car Registration Number <CarRegistrationNumber> and Select State <State> from drop down.")
    public void CarOneRegistration(String CarRegistrationNumber, String State) throws InterruptedException{

        Thread.sleep(10000);

        New_ponchoQuotePage.txtBox_Car1RegistrationNumber.sendKeys(CarRegistrationNumber);



        Driver.driver.findElement(By.xpath("//label[@for='vehicleRegistrationState-default-0']")).click();


        WebElement element = Driver.driver.findElements(By.xpath("//ul[@class='shared-InputSelect_dropdown-vehicleRegistrationState']//li//label")).stream().
                filter(e -> e.getText().equalsIgnoreCase(State)).findFirst().get();
        element.click();


    }

    @Step("Click Search button for Car1")
    public void ClickSearchButtonForCar1(){

        New_ponchoQuotePage.btn_CarSearch.click();
    }

    @Step("Click Yes This is my Car Button")
    public void CickYesThisisMyCarforCar1() throws InterruptedException{
        Thread.sleep(5000);
        New_ponchoQuotePage.btn_YesThisIsMyCar.click();
    }


    @Step("Enter address <address> to search parking address.")
    public void CarParkAtNightAddress(String address) throws InterruptedException{

        New_ponchoQuotePage.txtBox_Car1StreetAddress.sendKeys(address);
        Thread.sleep(5000);
        //New_ponchoQuotePage.txtBox_Car1StreetAddress.sendKeys(Keys.ARROW_DOWN);
        New_ponchoQuotePage.txtBox_Car1StreetAddress.sendKeys(Keys.ENTER);

    }

    @Step("Click Yes this is my address button.")
    public void YesThisIsMyAddressButton() throws InterruptedException{

        Thread.sleep(10000);
        New_ponchoQuotePage.btn_YesThisismyaddressCar1.click();
        System.out.println("Click Yes,This is my address Button");
    }

    @Step("Enter Kilometer <KM> for the car.")
    public void KiloMeterFortheCar(String KM) throws InterruptedException{

        Thread.sleep(5000);
        New_ponchoQuotePage.txtBox_HowManyKiloMeterCar1.sendKeys(KM);

    }

    @Step("Select car driven per week 1-2")
    public void CarDrivenPerWeek(){

        New_ponchoQuotePage.btn_DrivenPerWeekCar1.click();
    }

    @Step("Select how many kilo meter <KM> car driven each year")
    public void SelectCarDrivenEachYear(String KM){

        Driver.driver.findElement(By.xpath("//label[@for='vehicleKmsPerYear-default-0']")).click();

        WebElement element = Driver.driver.findElements(By.xpath("//ul[@class='shared-InputSelect_dropdown-vehicleKmsPerYear']//li//label")).stream().
                filter(e -> e.getText().contains(KM)).findFirst().get();
        element.click();

    }

    @Step("Select Car used for Personal Use Only.")
    public void CarUsedFor() throws InterruptedException{

        Thread.sleep(2000);
        New_ponchoQuotePage.btn_PersonalUseOnlyCar1.click();
    }

    @Step("Select No for car performance modification.")
    public void CarPerformanceModification() throws InterruptedException{

        Thread.sleep(2000);
        New_ponchoQuotePage.btn_PerformanceModificationNoCar1.click();
    }

    @Step("Select No for car accessories fitted by manufacturer.")
    public void CarfittedByManufacturer() throws InterruptedException{

        Thread.sleep(2000);
        New_ponchoQuotePage.btn_AccessoriesFittedNoCar1.click();
    }

    @Step("Select No for car accessories NOT fitted by manufacturer.")
    public void CarNotfittedByManufacturer() throws InterruptedException{
        Thread.sleep(2000);
        New_ponchoQuotePage.btn_AccessoriesNotFittedNoCar1.click();
    }

    @Step("Select No Damage for unrepaired accident or hail damage.")
    public void SelectCarDamage() throws InterruptedException{

        Thread.sleep(2000);
        New_ponchoQuotePage.btn_UnrepairedNoDamageCar1.click();
    }

    @Step("Select Financials as No Finance.")
    public void SelectFinancials() throws InterruptedException{

        Thread.sleep(2000);
        New_ponchoQuotePage.btn_NoFinanceCar1.click();
    }

    @Step("Verify Total car Value <CarValue>.")
    public void VerifyCarValue(String Carvalue){

        String CarPrice = New_ponchoQuotePage.label_VehicleValueCar1.getText();
        Assert.assertEquals(CarPrice,Carvalue);
    }


    @Step("Click Add Another Car button for Car2")
    public void ClickAddAnotherCarButtonForCar2() throws InterruptedException{

        Thread.sleep(5000);
        New_ponchoQuotePage.btn_AddAnotherCar.click();
    }

    @Step("Enter Car2 Registration Number <RegistrationNumber> snd Select State <State> from drop down.")
    public void EnterCar2RegistrationNumber(String RegistrationNumber, String Car2State) throws InterruptedException{

        Thread.sleep(5000);
        New_ponchoQuotePage.txtBox_Car2RegistrationNumber.sendKeys(RegistrationNumber);

        New_ponchoQuotePage.dropdown_Car2RegisterdState.click();

        WebElement element = Driver.driver.findElements(By.xpath("//ul[@class='shared-InputSelect_dropdown-vehicleRegistrationState']//li//label")).stream().
                filter(e -> e.getText().equalsIgnoreCase(Car2State)).findFirst().get();
        element.click();

    }


    @Step("Click Search button for Car2")
    public void ClickSearchButtonForCar2(){

        New_ponchoQuotePage.btn_Car2Search.click();
    }

    @Step("Click Yes this is My Car button for Car2")
    public void ClickyesthisisMycarButtonForCar2() throws InterruptedException{

        Thread.sleep(5000);
        New_ponchoQuotePage.btn_Car2YesThisIsMyCar.click();
    }

    @Step("Enter address <address> to search parking address for car2.")
    public void Car2ParkAtNightAddress(String address) throws InterruptedException{

        New_ponchoQuotePage.txtBox_Car2ParkingAddress.sendKeys(address);
        Thread.sleep(5000);
        New_ponchoQuotePage.txtBox_Car2ParkingAddress.sendKeys(Keys.ENTER);

    }


    @Step("Click Yes this is my address button for Car2.")
    public void Car2YesThisIsMyAddressButton() throws InterruptedException{

        Thread.sleep(10000);
        New_ponchoQuotePage.btn_Car2YesThisIsMyAddress.click();
        System.out.println("Click Yes,This is my address Button Car2");
    }


    @Step("Enter Kilometer <KM> for the car2.")
    public void Car2KiloMeterFortheCar(String KM) throws InterruptedException{

        Thread.sleep(5000);
        New_ponchoQuotePage.txtBox_Car2NumberOfKMDriven.sendKeys(KM);

    }

    @Step("Select car2 driven per week 1-2")
    public void Car2DrivenPerWeek() throws InterruptedException{

        Thread.sleep(1000);
        New_ponchoQuotePage.btn_Car2DrivenPerWeek1to2.click();
    }



    @Step("Select how many kilo meter <KM> car2 driven each year")
    public void SelectCar2DrivenEachYear(String KM){

        New_ponchoQuotePage.dropdown_Car2Driveneachyear.click();

        WebElement element = Driver.driver.findElements(By.xpath("//ul[@class='shared-InputSelect_dropdown-vehicleKmsPerYear']//li//label")).stream().
                filter(e -> e.getText().contains(KM)).findFirst().get();
        element.click();

    }

    @Step("Select Car2 used for Personal Use Only.")
    public void Car2UsedFor()throws InterruptedException{

        Thread.sleep(1000);
        New_ponchoQuotePage.btn_Car2UsedforPersonalUse.click();
    }

    @Step("Select No for car2 performance modification.")
    public void Car2PerformanceModification()throws InterruptedException{

        Thread.sleep(1000);
        New_ponchoQuotePage.btn_Car2PerformanceModificationNo.click();
    }

    @Step("Select No for car2 accessories fitted by manufacturer.")
    public void Car2fittedByManufacturer() throws InterruptedException {
        Thread.sleep(1000);
        New_ponchoQuotePage.btn_Car2fittedbyManufacturerNo.click();
    }

    @Step("Select No for car2 accessories NOT fitted by manufacturer.")
    public void Car2NotfittedByManufacturer()throws InterruptedException{
        Thread.sleep(1000);
        New_ponchoQuotePage.btn_Car2NotfittedbyManufacturerNo.click();
    }

    @Step("Select No Damage for unrepaired accident or hail damage for Car2.")
    public void SelectCar2Damage()throws InterruptedException{
        Thread.sleep(1000);
        New_ponchoQuotePage.btn_Car2NoDamage.click();
    }

    @Step("Select Financials as No Finance for Car2.")
    public void Car2SelectFinancials()throws InterruptedException{
        Thread.sleep(1000);
        New_ponchoQuotePage.btn_Car2NoFinance.click();
    }

    @Step("Verify Total car Value <CarValue> of Car2.")
    public void VerifyCar2Value(String Carvalue){

        String CarPrice = New_ponchoQuotePage.label_Car2value.getText();
        Assert.assertEquals(CarPrice,Carvalue);
    }


}
