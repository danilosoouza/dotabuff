package automation.dotabuff.utils;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

	protected WebDriver driver;
	
	protected abstract void CreateWebDriver();
	
	public void QuitWebDriver() {
		if(null != driver) {
			driver.quit();
			driver = null;
		}
	}
	
	public WebDriver GetWebDriver() {
		if (null == driver) {
			CreateWebDriver();
		}
		
		return driver;
	}
	
	
}
