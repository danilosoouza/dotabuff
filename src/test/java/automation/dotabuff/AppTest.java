package automation.dotabuff;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import automation.dotabuff.page.HomePage;
import automation.dotabuff.utils.DriverManager;
import automation.dotabuff.utils.DriverManagerFactory;
import automation.dotabuff.utils.DriverType;

public class AppTest {

	static DriverManager driverManager;
	static WebDriver driver;
	static String url = "https://www.opendota.com/";
	String title = "";
	
	static HomePage home;
	
	@BeforeClass
	public static void Initializing() {
		driverManager = DriverManagerFactory.GetDriverManager(DriverType.CHROME);
		driver = driverManager.GetWebDriver();
		//Abrir navegador na pagina
		//Adicionar todos os PageObjects abaixo
		home = new HomePage(driver);
		
		
		driver.get(url);
	}
	
	
	@Test
	public void SearchTest(){
		home.Procurar();		
	}
	
	@AfterClass
	public static void TearDown() {
		driverManager.QuitWebDriver();
	}
	
	
	
}
