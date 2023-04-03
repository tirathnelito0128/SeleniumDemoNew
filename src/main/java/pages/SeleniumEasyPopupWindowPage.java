package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumEasyPopupWindowPage {
WebDriver driver=null;
	
	public SeleniumEasyPopupWindowPage(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	
	@FindBy(xpath = "//a[text()='  Follow On Twitter ']")
	public WebElement twitterBtn;
	
	@FindBy(xpath = "//span[text()='No, thanks']")
	public WebElement noThanksBtn;
	
	@FindBy(xpath = "//button[@onclick='myConfirmFunction()']")
	public WebElement clickMeBtn;
	
	
	
	

}

