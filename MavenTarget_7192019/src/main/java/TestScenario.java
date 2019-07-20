import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario {

	WebDriver driver;
	
	public void openBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farabi\\Desktop\\Selenium\\chromedriver_win32//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.target.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	
	
	
	public void logoVerification() {
		
		
		boolean logo =	driver.findElement(By.xpath("//*[@id=\"home\"]")).isDisplayed();
		System.out.println(logo);
		}
	
	public void scrollDownPixel() {
		
		JavascriptExecutor x = (JavascriptExecutor)driver;
				x.executeScript("window.scrollBy(0,10000)");
		
	}
		
	
	public void FindCareer() {
		
		driver.findElement(By.xpath("//*[@id=\"select-11\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"options\"]/li[4]/a")).click();
	}
		
	
	
	public void closeBrowser() {
		
		driver.quit();
		
	}
	
	
	
	
}
