package automation.dotabuff.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	protected String url;
	protected WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void Open() {
		driver.get(url);
	}
	
	public String GetUrl() {
		return url;
	}
	
	protected void SendText(By by, String key) {
		driver.findElement(by).sendKeys(key);
	}
	
	public boolean IsTextPresent(String txt) {
		return driver.getPageSource().contains(txt);
	}
	
	public boolean IsElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean IsElementPresentAndDisplay(By by) {
		try {
			return driver.findElement(by).isDisplayed();
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public WebElement GetWebElement(By by) {
		return driver.findElement(by);
	}
	
	
	
	
}
