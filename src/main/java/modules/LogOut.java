package modules;

import org.openqa.selenium.By;

import testBase.TestBase;

public class LogOut extends TestBase
{
	By Log_Out= By.xpath("//img[@src='/images/forms/Logout.gif']");
	
	By Log_Out_DifferentXpath=By.xpath("//a[contains(text(),'SIGN-OFF')]");
	
	public void LogginOut()
	{
		
		driver.findElement(Log_Out).click();
		
	}
	public void LoggOFFDifferent()
	{
		driver.findElement(Log_Out_DifferentXpath).click();
	}
	
}
