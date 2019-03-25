package modules;

import org.openqa.selenium.By;

import testBase.TestBase;

public class PassengersDetails extends TestBase
{
	By FirstName = By.xpath("//input[@name='passFirst0']");
	By LastName = By.xpath("//input[@name='passLast0']");
	By MealType=By.xpath("//select[@name='pass.0.meal']/option[@value='HNML']");
	By CardType=By.xpath("//select[@name='creditCard']/option[@value='DC']");
	By Number = By.xpath("//input[@name='creditnumber']");
	By ExpirationMonth=By.xpath("//select[@name='cc_exp_dt_mn']/option[4]");
	By Expirationyear = By.xpath("//select[@name='cc_exp_dt_yr']/option[@value='2002']");
	By CardFN= By.xpath("//input[@name='cc_frst_name']");
	By CardLN=By.xpath("//input[@name='cc_last_name']");
	
	By Address=By.xpath("//input[@name='billAddress1']");
	By City=By.xpath("//input[@name='billCity']");
	By State=By.xpath("//input[@name='billState']");
	By Zip=By.xpath("//input[@value='94089']");
	By Country = By.xpath("//select[@name='billCountry']/option[@value='92']");
	By AddDeleivery=By.xpath("//input[@name='delAddress1']");
	By SecureButton=By.xpath("//input[@name='buyFlights']");
	
	
	
	public void FirstNameData(String Fname)
	{
		driver.findElement(FirstName).sendKeys(Fname);
	}
	
	public void LastName(String Lname)
	{
		driver.findElement(LastName).sendKeys(Lname);
	}
	public void MealSelection ()
	{
		driver.findElement(MealType).click();
	}
	public void CardSelection ()
	{
		driver.findElement(CardType).click();
	}
	public void CardNumber(String numbr)
	{
		driver.findElement(Number).sendKeys(numbr);
	}
	public void ExpirationMonthSelection()
	{
		driver.findElement(ExpirationMonth).click();
	}
	public void ExpirationyearSelection()
	{
		driver.findElement(Expirationyear).click();
	}
	public void CardFNData(String CCN)
	{
		
		driver.findElement(CardFN).sendKeys(CCN);
	}
	public void CardLNData(String CCL)
	{
		driver.findElement(CardLN).sendKeys(CCL);
		
	}
	
	public void AddressField(String Add)
	{
		
		driver.findElement(Address).clear();
		driver.findElement(Address).sendKeys(Add);
	}
	public void CityField(String Cit)
	{	
		driver.findElement(City).clear();
		driver.findElement(City).sendKeys(Cit);
	}
	
	public void StateField(String Sta)
	{
		driver.findElement(State).clear();
		driver.findElement(State).sendKeys(Sta);
	}
	public void ZipField(String ZP)
	{
		driver.findElement(Zip).sendKeys(ZP);
	}
	public void CountryDD ()
	{
		driver.findElement(Country).click();	
	}
	public void DeliveryAddress(String del)
	{	
		driver.findElement(AddDeleivery).clear();
		driver.findElement(AddDeleivery).sendKeys(del);
		
	}
	
	public void SecureClick()
	{
		driver.findElement(SecureButton).click();
	}
	
}
