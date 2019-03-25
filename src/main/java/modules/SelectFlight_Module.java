package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testBase.TestBase;

public class SelectFlight_Module extends TestBase
{

	By DepartCity=By.xpath("//input[@value='Pangea Airlines$362$274$9:17']");
	By ReturnCity = By.xpath("//input[@value='Unified Airlines$633$303$18:44']");
	By ConinueBttn = By.xpath("//input[@name='reserveFlights']");
	
	public void Departing()
	{
		
		driver.findElement(DepartCity).click();
		
	}
	public void Returning()
	{
		
		driver.findElement(ReturnCity).click();
	}
	
	public WebElement ContinueBttnVISIBle()
	{
		
		return driver.findElement(ConinueBttn);
	}
	public void cntinueClick()
	{
		driver.findElement(ConinueBttn).click();
	}
	

}
