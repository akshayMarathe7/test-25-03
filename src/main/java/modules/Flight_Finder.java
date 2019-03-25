package modules;

import org.openqa.selenium.By;

import testBase.TestBase;

public class Flight_Finder extends TestBase
{

	By Type_RadioBttn = By.xpath("//input[@value='oneway']");
	By PassengerSelection_Dropdown = By.xpath("//select[@name='passCount']/option[text()='2 ']");
	By DepartingFrom_DropDown =By.xpath("//select[@name='fromPort']/option[@value='Paris']");
	By On_MonthDropDown = By.xpath("//select[@name='fromMonth']/option[@value='5']");
	By On_Date= By.xpath("//select[@name='fromDay']/option[@value='5']");
	By ArrivingCity_DD = By.xpath("//select[@name='toPort']/option[@value='Seattle']");
	By ReturnMonth_DD =By.xpath("//select[@name='toMonth']/option[@value='10']");
	By ReturnDate_DD =By.xpath("//select[@name='toDay']/option[29]");
	By ClassType_Radio =By.xpath("//input[@value='First']");
	By COntinue_Bttn= By.xpath("//input[@name='findFlights']");
	
	By Header=By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']");
	
	
	public void FlighDetail_Filling()
	{
		
		driver.findElement(Type_RadioBttn).click();
		driver.findElement(PassengerSelection_Dropdown).click();
		driver.findElement(DepartingFrom_DropDown).click();
		driver.findElement(On_MonthDropDown).click();
		driver.findElement(On_Date).click();
		driver.findElement(ArrivingCity_DD).click();
		driver.findElement(ReturnDate_DD).click();
		driver.findElement(ReturnMonth_DD).click();
	}
	
	public void Preferences()
	{
		driver.findElement(ClassType_Radio).click();
	}
	public void ContinueToNext()
	{
		driver.findElement(COntinue_Bttn).click();
	}
	
	public String GetTitle()
	{
		
		return  driver.getTitle();
	}
	
	
}
