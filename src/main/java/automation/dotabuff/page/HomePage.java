package automation.dotabuff.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

	@FindBy (id = "searchField")
	private WebElement inputSearch;

	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void Procurar() {
		FazerBusca(inputSearch,"Akemiii");
	}
		
	

}
