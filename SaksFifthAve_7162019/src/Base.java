import org.openqa.selenium.WebDriver;

public class Base {

	
	WebDriver alpha;
	
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farabi\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		alpha.get("https://www.saksfifthavenue.com/Entry.jsp");
		alpha.navigate().refresh();
		
	}
	
	public void closeBrowser() {
		
		alpha.quit();
	}
	
	
	
}
