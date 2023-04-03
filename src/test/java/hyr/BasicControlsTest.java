package hyr;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.BasicControlsPage;
import pages.GoogleSearchPage;
import utility.DriverFactory;

public class BasicControlsTest {
	
	
	@Test
	public void testBasicControls()
	{
		ChromeDriver driver= DriverFactory.getDriver();
		BasicControlsPage basicControlsPage = new BasicControlsPage(driver);
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		basicControlsPage.fistName.sendKeys("Tirath");
		basicControlsPage.lastName.sendKeys("Singh");
		basicControlsPage.gender.click();
		basicControlsPage.language.click();
		basicControlsPage.email.sendKeys("tirath.singh0128@gmail.com");
		basicControlsPage.password.sendKeys("1234");
		basicControlsPage.regiterBtn.click();
		
		driver.close();
	}

}
