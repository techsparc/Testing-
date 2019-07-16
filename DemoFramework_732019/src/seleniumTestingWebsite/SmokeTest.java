package seleniumTestingWebsite;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SmokeTest {

	
	@Test
	public void testRun() throws InterruptedException {
		
		Base browser = new Base();
		browser.openBrowser();
		
		TestScenario a = new TestScenario(); // create an object of the class 
		a.clicker();
		
		
		
		
		
		
		
			
		
		
		
	}
	
}
