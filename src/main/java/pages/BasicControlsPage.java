package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicControlsPage {
ChromeDriver driver=null;
	
	public BasicControlsPage(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "fName")
	public WebElement fistName;
	
	@FindBy(name = "lName")
	public WebElement lastName;
	
	@FindBy(id = "femalerb")
	public WebElement gender;
	
	@FindBy(id = "englishchbx")
	public WebElement language;
	
	@FindBy(id = "email")
	public WebElement email;
	
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(id = "registerbtn")
	public WebElement regiterBtn;
}
