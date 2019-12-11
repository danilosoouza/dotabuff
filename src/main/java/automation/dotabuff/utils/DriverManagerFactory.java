package automation.dotabuff.utils;

public class DriverManagerFactory {

	//TODO implements more drivers
	public static DriverManager GetDriverManager(DriverType type) {
		DriverManager driverManager;
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		
	switch(type) {
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
			
			default:
				System.out.println("TODO implementar mais drivers");
				driverManager = null;
				break;
		}
		
		return driverManager;
	}
	
	
}
