package automation.dotabuff;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import automation.dotabuff.utils.DriverManager;
import automation.dotabuff.utils.DriverManagerFactory;
import automation.dotabuff.utils.DriverType;
import junit.framework.Assert;

public class AppTest {

	DriverManager driverManager;
	WebDriver driver;
	String url = "https://www.dotabuff.com/";
	String title = "DOTABUFF - Dota 2 Statistics";
	
	
	@Test
	public void DotabuffTest() {
		driverManager = DriverManagerFactory.GetDriverManager(DriverType.CHROME);
		driver = driverManager.GetWebDriver();
		driver.get(url);
		
		Assert.assertEquals(title, driver.getTitle());
		
	}
	
	@AfterClass
	public void TearDown() {
		driverManager.QuitWebDriver();
	}
	
	
	
}
