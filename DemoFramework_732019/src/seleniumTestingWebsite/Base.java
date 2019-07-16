package seleniumTestingWebsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	WebDriver driver;
	
	public WebDriver openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farabi\\eclipse-workspace\\SampleFramework_6292019\\src\\Executables\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
}
