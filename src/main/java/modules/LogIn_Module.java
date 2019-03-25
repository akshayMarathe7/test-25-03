package modules;

import org.openqa.selenium.By;

import testBase.TestBase;

public class LogIn_Module extends TestBase
{

	By UserName_TxtField = By.name("userName");
	By PassWord_TxtField = By.xpath("//input[@name='password']");
	By SignIn_Bttn = By.name("login");
	
	public void LoggIn_Process(String user , String pass)
	{
		driver.findElement(UserName_TxtField).sendKeys(user);
		driver.findElement(PassWord_TxtField).sendKeys(pass);
		driver.findElement(SignIn_Bttn).click();
		
	}
	
	
}
