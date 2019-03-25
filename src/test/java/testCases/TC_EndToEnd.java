package testCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import modules.Flight_Finder;
import modules.LogIn_Module;
import modules.LogOut;
import modules.PassengersDetails;
import modules.SelectFlight_Module;
import testBase.TestBase;
import utilities.ExcelRead;
@Listeners(utilities.Listners.class)

public class TC_EndToEnd extends TestBase
{

	@DataProvider(name="ExcelData")
	public String [][] ExcelData() throws IOException
	{
		ExcelRead objExcel = new ExcelRead();
		String [][] FetchedData=objExcel.ExcelData_Read();
		return FetchedData;			
	}
	
	@Test (priority=0)
	public void BrowserInvoke()
	{
		Browser_Initialize();
		Url_Load("http://newtours.demoaut.com/");
	}
	
	@Test(priority=1, dataProvider="ExcelData")
	public void LogginOperation(String user, String pass)
	{
		LogIn_Module objLogin = new LogIn_Module();
		objLogin.LoggIn_Process(user, pass);
	}

	@Test (priority=2)
	public void FlightDetails()
	{
		Flight_Finder objFlight= new Flight_Finder();
		objFlight.FlighDetail_Filling();
		objFlight.Preferences();
	}
	
	@Test (priority=3)
	public void ContinueToFlightOptions()
	{
		Flight_Finder objFlight1=new Flight_Finder();
		objFlight1.ContinueToNext();
	}
	@Test (priority=4)
	public void DepartingCitySelect()
	{
		SelectFlight_Module objSelectFlight=new SelectFlight_Module();
		objSelectFlight.Departing();
		objSelectFlight.Returning();
		objSelectFlight.cntinueClick();
	}
	
	@Test (priority=5)
	public void PassengerDEtails()
	{
		PassengersDetails objPassenger = new PassengersDetails();
		objPassenger.FirstNameData("akshay");
		objPassenger.LastName("marathe");
		objPassenger.MealSelection();
		objPassenger.CardSelection();
		objPassenger.CardNumber("123456789");
		objPassenger.ExpirationMonthSelection();
		objPassenger.ExpirationyearSelection();
		objPassenger.CardFNData("akky");
		objPassenger.CardLNData("mara");
		objPassenger.SecureClick();
	}
	@Test(priority=6)
	public void LogginOut()
	{
		LogOut objlog=new LogOut();
		objlog.LogginOut();
		
		System.out.println("Succssfully completed end to end");
		driver.quit();
		
	}
}
	
	

