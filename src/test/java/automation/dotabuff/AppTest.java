package automation.dotabuff;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import automation.dotabuff.page.HomePage;
import automation.dotabuff.utils.DriverManager;
import automation.dotabuff.utils.DriverManagerFactory;
import automation.dotabuff.utils.DriverType;
import junit.framework.Assert;

public class AppTest {

	DriverManager driverManager;
	WebDriver driver;
	String url = "https://www.dotabuff.com/";
	String title = "DOTABUFF - Dota 2 Statistics";
	
	HomePage home;
	
	@BeforeClass
	public void Init() {
		driverManager = DriverManagerFactory.GetDriverManager(DriverType.CHROME);
		driver = driverManager.GetWebDriver();
		//Abrir navegador na pagina
		driver.get(url);
		//Adicionar todos os PageObjects abaixo
		home = new HomePage(driver);
		
	}
	
	
	@Test
	public void SearchTest() {
		home.Procurar();		
	}
	
	@AfterClass
	public void TearDown() {
		driverManager.QuitWebDriver();
	}
	
	
	
}
