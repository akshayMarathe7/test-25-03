package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase{

	public static WebDriver driver;

	public void Browser_Initialize() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void Browser_IE()

	{

		System.setProperty("webdriver.ie.driver", "src\\test\\resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	public void Browser_Opera() {
		System.setProperty("webdriver.opera.driver",
				"E:\\Soft\\Selenium\\Drivers\\OperaDriver\\operadriver_win64\\operadriver.exe");
		driver = new OperaDriver();
	}

	public void Url_Load(String url) {
		driver.get(url);

		driver.manage().window().maximize();

		// Select s = new Select(driver.findElement(By.xpath("\\select")));
	}

}
