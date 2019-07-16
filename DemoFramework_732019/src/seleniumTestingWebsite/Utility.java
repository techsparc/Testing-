package seleniumTestingWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Utility extends Base{

		public void customizeClick(By x) {
			
			driver.findElement(x).click(); 	
		}

		public void scrollDownPixel() {
			
			JavascriptExecutor scrolldown = (JavascriptExecutor)driver;
			scrolldown.executeScript("window.scrollBy(0,250)");
		}





}
