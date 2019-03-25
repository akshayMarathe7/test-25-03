package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\Soft\\\\Selenium\\\\ChromeDriver1\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		Thread.sleep(20000);
		
		driver.manage().window().maximize();
		
		driver.navigate().back();

	}

}
