package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	ChromeDriver driver=null;
	
	public RegistrationPage(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement firstNameInput;
	
	
	
	@FindBy(xpath = "//label[text()='E-Mail']/parent::div//*/input")
	public WebElement lastNameInput;
	
	@FindBy(xpath = "//label[text()='E-Mail']/parent::div//*/input")
	public WebElement emailInput;
	
	@FindBy(xpath = "//input[@name='phone']")
	public WebElement phoneInput;
	
	@FindBy(xpath = "//input[@name='address']")
	public WebElement address;
	
	@FindBy(xpath = "//input[@name='city']")
	public WebElement city;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateInput;
}
	
	
