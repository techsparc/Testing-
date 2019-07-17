import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class smokeTest {

	@BeforeClass
	 
	public static void browser() {
		
		Base beta = new Base();
		beta.openBrowser();
	}
	
	@Test
	
	public void testing() {
		
		
		testScenario run = new testScenario();
		run.testPhase();
		
	
	}
	
	@AfterClass
	
	public static void end() {
		
		Base lambda = new Base();
		lambda.closeBrowser();
		
		
	}
	
	
	
	
}

	