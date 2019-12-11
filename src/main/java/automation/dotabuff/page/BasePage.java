package automation.dotabuff.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public boolean ElementoExiste(WebElement el) {
		return el != null;		
	}
	
	public boolean EsperarElementoSerVisivel(WebElement el) {
		return el.isDisplayed();
	}
	
	public WebElement EsperarElementoExistir(WebElement el) {
		WebDriverWait wait = new WebDriverWait(driver, WAIT_IN_SECONDS);
		wait.until(ExpectedConditions.visibilityOf(el));
		
		return el;
	}
	
	public void VerificarDigitar(WebElement el, String texto) {
		DigitarTexto(EsperarElementoExistir(el), texto);
	}
	
	public void DigitarTexto(WebElement el, String texto) {
		el.sendKeys(texto);
	}
	
	public void Clickar(WebElement el) {
		el.click();
	}
}
