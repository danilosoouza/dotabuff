package automation.dotabuff.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

//TODO adicionar metodos para ser usado em todas as classes que herdarem a basePage
public class BasePage {

	private static final int WAIT_IN_SECONDS = 15;
	private static final int PAGE_LOAD_TIMEOUT_SECONDS = 180;
	protected String url;
	protected WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Abrir() {
		driver.get(url);
	}
	
	public String RetornarUrl() {
		return url;
	}
	
	protected void DigitarTexto(By by, String key) {
		driver.findElement(by).sendKeys(key);
	}
	
	public boolean VerificarTexto(String txt) {
		return driver.getPageSource().contains(txt);
	}
	
	public boolean VerificarElemento(By by) {
		try {
			driver.findElement(by);
			return true;
		}catch(NoSuchElementException e) {
			System.out.println(e);
			return false;
		}
	}
	
	public boolean VerificarExibicaoElemento(By by) {
		try {
			return driver.findElement(by).isDisplayed();
		}catch(NoSuchElementException e) {
			System.out.println(e);
			return false;
		}
	}
	
	public WebElement RetornarWebElement(By by) {
		return driver.findElement(by);
	}
	
	
	
	
}
