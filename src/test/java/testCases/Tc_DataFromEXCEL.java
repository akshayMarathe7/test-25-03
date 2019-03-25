package testCases;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import modules.Flight_Finder;
import modules.LogIn_Module;
import modules.PassengersDetails;
import modules.SelectFlight_Module;
import testBase.TestBase;

import utilities.Excel_All_Data_From_Excel;

public class Tc_DataFromEXCEL extends TestBase
{
	@DataProvider(name="ExcelLoadURL")
	public String[][] ExcelDataLoadURL() throws Exception
	{
		Excel_All_Data_From_Excel URLobj=new Excel_All_Data_From_Excel();
		
		String [][]FetchedData=URLobj.ExcelData("Sheet1", "\\Test Data\\AllDataFromExcel.xlsx");
		
		return FetchedData;
	}
	@DataProvider (name="ExcelLogin")
	public String [][] ExcelLoginApp () throws Exception
	{
		Excel_All_Data_From_Excel LogObj = new Excel_All_Data_From_Excel();
	
		String [][] FetchedData=LogObj.ExcelData("Sheet2", "\\Test Data\\AllDataFromExcel.xlsx");
	
		return FetchedData;
	}
	
	@DataProvider (name="PassengerDetails")
	public String[][]Excel_Passenger() throws Exception
	{
		Excel_All_Data_From_Excel PassObj = new Excel_All_Data_From_Excel();
		String [][]FetchedData=PassObj.ExcelData("Sheet4", "\\Test Data\\AllDataFromExcel.xlsx");
		return FetchedData;		
	}
	
	@Test (priority=0, groups ="Smoke")
	public void LoadBrowser()
	{	
		Browser_Initialize();	
	}
	
	@Test(priority=1, dataProvider="ExcelLoadURL", groups = "Smoke")
	public void LoadingURLFromEXCEL(String URL)
	{
		Url_Load(URL);
		
	}
	
	@Test (priority=2,dataProvider="ExcelLogin")
	public void LoginToApp(String i, String j)
	{
		LogIn_Module LogInobj=new LogIn_Module();
		LogInobj.LoggIn_Process(i, j);
		System.out.println("Git.....");
		System.out.println("Changes By Other");
	}

	@Test (priority=3)
	public void Flight_Details()
	{
		Flight_Finder FlightObj=new Flight_Finder();
//Assert		
	//	Assert.assertEquals(FlightObj.GetTitle(), "Find a Flight: Mercury Tours");

		FlightObj.FlighDetail_Filling();
		FlightObj.Preferences();
		FlightObj.ContinueToNext();
		System.out.println("Practice push into git");
		System.out.println("Practice Pull Command");
		
	}
	@Test (priority=4)
	public void SelectingFlights()
	{
		SelectFlight_Module FlightObj=new SelectFlight_Module();
		FlightObj.Departing();
		FlightObj.Returning();
//Assert		
		Assert.assertTrue(FlightObj.ContinueBttnVISIBle().isDisplayed());
	//	Assert.assertFalse(FlightObj.ContinueBttnVISIBle().isDisplayed());
	
		
		FlightObj.cntinueClick();
		
	}
	
	@Test(priority=5,dataProvider="PassengerDetails")
	public void PassengerDetails(String FName, String LName, String TCNmbr, String TCFN, String TCLN, String TAdd, String TCit, String TSta, String TZP, String Tdel) throws InterruptedException
	{
		PassengersDetails PassngrObj=new PassengersDetails();
		
		PassngrObj.FirstNameData(FName);
		PassngrObj.LastName(LName);
		PassngrObj.MealSelection();
		PassngrObj.CardSelection();
		PassngrObj.CardNumber(TCNmbr);
		PassngrObj.ExpirationMonthSelection();
		
		Thread.sleep(2000);

		PassngrObj.ExpirationyearSelection();
		PassngrObj.CardFNData(TCFN);
		PassngrObj.CardLNData(TCLN);
		PassngrObj.AddressField(TAdd);
		PassngrObj.CityField(TCit);
		PassngrObj.StateField(TSta);
		PassngrObj.ZipField(TZP);
		PassngrObj.CountryDD();      
		PassngrObj.DeliveryAddress(Tdel);
		
		System.out.println(Tdel);
		Thread.sleep(10000);
		PassngrObj.SecureClick();

	}
	
	@Test(priority = 6, groups = "Smoke")
	public void quitAll()
	{
		driver.quit();
	}
}
