package PonchoWebObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class Poncho_QuotePage {


    protected WebDriver driver;

    //Policy Start First Name Text Box
    @FindBy(how = How.XPATH, using ="//input[@id='policyStartFirstName']")
    public WebElement txtBox_PolicyStartFirstName;


    //Policy Start Last Name Text Box
    @FindBy(how = How.XPATH, using ="//input[@id='policyStartLastName']")
    public WebElement txtBox_PolicyStartLastName;



    //Policy Start Date Calendar
    @FindBy(how = How.XPATH, using ="//input[@id='policyStartDate']")
    public WebElement txtBox_PolicyStartDate;

    //Get a Quote Button
    @FindBy(how = How.XPATH, using ="//button[@class='poncho-btn-primary-reg']")
    public WebElement btn_GetaQuote;


    //Cars Registration Screen Objects.

    @FindBy(how = How.XPATH, using ="//input[@id='vehicleLicensePlate-0']")
    public WebElement txtBox_Car1RegistrationNumber;


    //Car1 Search Button

    @FindBy(how = How.XPATH, using ="//button[@class='shared-InputVehicleSearch poncho-btn-primary-reg ']")
    public WebElement btn_CarSearch;


    //Yes This  is my Car Button
    @FindBy(how = How.XPATH, using ="//button[@class='shared-InputVehicleSelectButton poncho-btn-primary-reg']")
    public WebElement btn_YesThisIsMyCar;

    //Car 1 Stret Address text box

    @FindBy(how = How.XPATH, using ="//input[@id='vehicleAddress-0']")
    public WebElement txtBox_Car1StreetAddress;


    //Car1 Yes this is my address button
    @FindBy(how = How.XPATH, using ="//button[@class='shared-VehicleAddressConfirmationButton poncho-btn-primary-reg']")
    public WebElement btn_YesThisismyaddressCar1;


    //Car1 How many kilometer text box
    @FindBy(how = How.XPATH, using ="//input[@id='vehicleDriven-0']")
    public WebElement txtBox_HowManyKiloMeterCar1;

    //Car1 driven per week 1-2
    @FindBy(how = How.XPATH, using ="//label[@for='vehicleUsagePerWeek-0-0']")
    public WebElement btn_DrivenPerWeekCar1;

    //Car1 used for
    @FindBy(how = How.XPATH, using ="//label[@for='vehicleUse-0-0']")
    public WebElement btn_PersonalUseOnlyCar1;

    //Car Performance modification
    @FindBy(how = How.XPATH, using ="//label[@for='vehicleModifications-0-0']")
    public WebElement btn_PerformanceModificationNoCar1;


    //Car accessories fitted
    @FindBy(how = How.XPATH, using ="//label[@for='vehicleHasEquipment-0-0']")
    public WebElement btn_AccessoriesFittedNoCar1;


    //Car accessories Not fitted
    @FindBy(how = How.XPATH, using ="//label[@for='vehicleHasAccessories-0-0']")
    public WebElement btn_AccessoriesNotFittedNoCar1;

    //Car UnRepaired accident
    @FindBy(how = How.XPATH, using ="//label[@for='vehicleDamage-0-0']")
    public WebElement btn_UnrepairedNoDamageCar1;


    //Car load type no finance

    @FindBy(how = How.XPATH, using ="//label[@for='vehicleLoanType-0-0']")
    public WebElement btn_NoFinanceCar1;


    //Car Value

    @FindBy(how = How.XPATH, using ="//div[@id='vehicleValue-0']")
    public WebElement label_VehicleValueCar1;


    //Add Car2 Objects


    //Add Another Car button
    @FindBy(how = How.XPATH, using ="//button[@id='add-group']")
    public WebElement btn_AddAnotherCar;

    //Add Another Car button
    @FindBy(how = How.XPATH, using ="//input[@id='vehicleLicensePlate-1']")
    public WebElement txtBox_Car2RegistrationNumber;

    //Car registered state drop down
    @FindBy(how = How.XPATH, using ="//label[contains(@class,'placeholder')]")
    public WebElement dropdown_Car2RegisterdState;

    //Search button
    @FindBy(how = How.XPATH, using ="//button[contains(@class,'shared-InputVehicleSearch poncho-btn-primary-reg')]")
    public WebElement btn_Car2Search;

    //Car2 Yes this is my car
    @FindBy(how = How.XPATH, using ="//button[contains(@class,'shared-InputVehicleSelectButton poncho-btn-primary-reg')]")
    public WebElement btn_Car2YesThisIsMyCar;

    //Car2 Verhicle street address
    @FindBy(how = How.XPATH, using ="//input[@id='vehicleAddress-1']")
    public WebElement txtBox_Car2ParkingAddress;

    //Car2 Yes this is my address
    @FindBy(how = How.XPATH, using ="//span[contains(text(),'Yes, this is my address')]")
    public WebElement btn_Car2YesThisIsMyAddress;


    //Car2 Number of KM Driven
    @FindBy(how = How.XPATH, using ="//input[@id='vehicleDriven-1']")
    public WebElement txtBox_Car2NumberOfKMDriven;


    //Car2 Driven Per Week
    @FindBy(how = How.XPATH, using ="//label[@for='vehicleUsagePerWeek-0-1']")
    public WebElement btn_Car2DrivenPerWeek1to2;


    //Car2 Driven each year drop down
    @FindBy(how = How.XPATH, using ="//label[contains(@class,'placeholder')]")
    public WebElement dropdown_Car2Driveneachyear;


    //Car2 Used for personal use
    @FindBy(how = How.XPATH, using ="//label[@for='vehicleUse-0-1']")
    public WebElement btn_Car2UsedforPersonalUse;

    //Car2 performance modification No
    @FindBy(how = How.XPATH, using ="//label[@for='vehicleModifications-0-1']")
    public WebElement btn_Car2PerformanceModificationNo;

    //Car2  fitted By Manufacturer No
    @FindBy(how = How.XPATH, using ="//label[@for='vehicleHasEquipment-0-1']")
    public WebElement btn_Car2fittedbyManufacturerNo;


    //Car2 Not fitted By Manufacturer No
    @FindBy(how = How.XPATH, using ="//label[@for='vehicleHasAccessories-0-1']")
    public WebElement btn_Car2NotfittedbyManufacturerNo;

    //Car2 No Damage
    @FindBy(how = How.XPATH, using =" //label[@for='vehicleDamage-0-1']")
    public WebElement btn_Car2NoDamage;

    //Car2 No Finance
    @FindBy(how = How.XPATH, using ="//label[@for='vehicleLoanType-0-1']")
    public WebElement btn_Car2NoFinance;

    //Car2 Value
    @FindBy(how = How.XPATH, using ="//div[@id='vehicleValue-1']")
    public WebElement label_Car2value;

    public Poncho_QuotePage(WebDriver driver) {

        this.driver = driver;

    }

}
