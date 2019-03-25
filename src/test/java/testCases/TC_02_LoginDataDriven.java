package testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import modules.Flight_Finder;
import modules.LogIn_Module;
import modules.LogOut;
import testBase.TestBase;
import utilities.ExcelRead;

public class TC_02_LoginDataDriven extends TestBase
{
		
	@DataProvider (name="ExcelData")
	public String [][] GetDataFromExcel() throws IOException
	{
		ExcelRead Excel_obj=new ExcelRead();
		
		String [][] FetchedData=Excel_obj.ExcelData_Read();
		
		return FetchedData;
	}
	
	
	
	@Test(priority=0)
	public void LoadBrwser()
	{
		Browser_Initialize();
		Url_Load("http://newtours.demoaut.com/");
	}

 /* 	@Test(priority=1)
	
	public void LoggInWithWxcel()
	{	
		LogIn_Module loginObj = new LogIn_Module();
		
		loginObj.LoggIn_Process();
	}

*/
	@Test (dataProvider="ExcelData")
	public void OperationWithExcel(String User, String Pass)
	{
		LogIn_Module LogInObj = new LogIn_Module();
		LogInObj.LoggIn_Process(User, Pass);
		
		LogOut LogOutObj= new LogOut();
		LogOutObj.LoggOFFDifferent();
		driver.quit();
	}

}