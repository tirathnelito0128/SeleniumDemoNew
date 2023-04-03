package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	
WebDriver driver=null;
	
	public GoogleSearchPage(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	
	@FindBy(name = "q")
	public WebElement googleSearchInput;
	

}
