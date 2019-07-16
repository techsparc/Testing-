package seleniumTestingWebsite;

import org.openqa.selenium.By;

public class TestScenario extends Base {

	public void clicker() {
		
		Utility importingFunc = new Utility();
		
		Repository repo = new Repository();
		
		importingFunc.customizeClick(By.xpath(repo.topMenu));
		importingFunc.customizeClick(By.xpath(repo.tShirt));
		importingFunc.customizeClick(By.xpath(repo.prodPage));
		importingFunc.customizeClick(By.xpath(repo.addCart));
		importingFunc.customizeClick(By.xpath(repo.proCheckout));
		importingFunc.customizeClick(By.xpath(repo.checkOut));
		
		
	}
	
	
	
	
}
