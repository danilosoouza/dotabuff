package automation.dotabuff.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	@FindBy (id="q")
	private WebElement inputSearch;
	
	@FindBy (xpath = "/html/body/div[1]/div[8]/div[3]/div[2]/div[1]/section[1]/article/div/form/button")
	private WebElement buttonSearch;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void Procurar(String text) {
		
	}
		
	

}
