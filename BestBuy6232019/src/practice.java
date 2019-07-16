import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	WebDriver a;
	
	public void openBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farabi\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		a = new ChromeDriver(); 
		a.get("https://www.bestbuy.com/");
	}
	
	
	public void closeBrowser() {
		
		a.quit();	
	}
	
	public void verifyLogo() {
		
		boolean z = a.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
		System.out.println(z);
		
	}
	
	public void maxBrowser() {
		
		a.manage().window().maximize();
		
	}
	
	public void browserRefresh() {
		
		a.navigate().refresh();

	}
	
	/*public void cut() {
		
		a.findElement(By.xpath("//*[@id=\"modal452\"]/div/div/div[1]/button/span[2]")).click();
	}*/
	
	public void sBar() throws InterruptedException {
		
		a.findElement(By.xpath("//*[@id=\"gh-search-input\"]")).click();
		a.findElement(By.xpath("//*[@id=\"gh-search-input\"]")).sendKeys("samsung galaxy s10 plus");
		a.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[2]/form/button[2]")).sendKeys(Keys.RETURN);
		
	}
	
	
	public void sResult() {
		
		a.findElement(By.xpath("//*[@id=\"widget-4a2f1c98-43c3-4301-b9e2-58aa669880ac\"]/div/div[2]/div[1]/div[1]/a/img")).click();
		a.findElement(By.xpath("//*[@id=\"fulfillment-add-to-cart-button-97ae28fb-ed34-481c-bc6c-42b4db7266be\"]/div/div/button")).click();
		a.findElement(By.xpath("//*[@id=\"fulfillment-add-to-cart-button-97ae28fb-ed34-481c-bc6c-42b4db7266be\"]/div/div/button")).click();
		a.findElement(By.xpath("//*[@id=\"cartApp\"]/div/div[1]/div/div/span/div/div[3]/div/div[1]/div[1]/div/button")).click();
	}
	
	
	public void sdPixel() {
		
		//How to scroll down: Code below:
		/*JavascriptExecutor scrolldown = (JavascriptExecutor)a;
		scrolldown.executeScript("window.scrollBy(0,1000)");*/
		
		//Scroll bottom of the page by pixel
		JavascriptExecutor scrolldown = ((JavascriptExecutor)a);
		scrolldown.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	
	}
	
	
	public void scrollDownElement() {
		
		WebElement Element = a.findElement(By.linkText("Add to Cart"));            
		//js.executeScript("arguments[0].scrollIntoView();", Element);
	    
		
	}
	
	
	
	public void result() {
		
		a.findElement(By.xpath("//*[@id=\"fulfillment-add-to-cart-button-e1bbfb7f-d3a8-4bd4-9171-2b3c3e3c1a52\"]/div/div/button")).click();
		
	}
	
	
	
	
	
}
