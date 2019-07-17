import org.openqa.selenium.By;

public class testScenario {

	
	public void testPhase() {
		
		utility apple = new utility();
		
		repository repo = new repository();
		
		
		apple.custClick(By.xpath(repo.searchBar));
		apple.custClick(By.xpath(repo.men));
		apple.custClick(By.xpath(repo.jeans));
		apple.custClick(By.xpath(repo.fResult));
		apple.custClick(By.xpath(repo.size));
		apple.custClick(By.xpath(repo.addBag));
		apple.custClick(By.xpath(repo.checkout));
		
		
		
		
		
		
	}
}
