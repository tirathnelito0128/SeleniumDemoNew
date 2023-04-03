package alertandmodals;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.SeleniumEasyPopupWindowPage;
import utility.DriverFactory;

public class PopupWindowTest {
	
	
WebDriver driver=null;
	
	//@Test
	public void testGoogle() throws InterruptedException
	{
		driver= DriverFactory.getDriver();
		
		driver.navigate().to("http://demo.seleniumeasy.com/window-popup-modal-demo.html");
		
		SeleniumEasyPopupWindowPage seleniumEasyPopupWindowPage = new SeleniumEasyPopupWindowPage(driver);
		seleniumEasyPopupWindowPage.twitterBtn.click();
		String mainWindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		
		System.out.println("Current============="+mainWindow);
		System.out.println("Set============="+windows);
		
		for(String win:windows)
		{
			if(win!=mainWindow) {
				driver.switchTo().window(win);
			}
		}
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(seleniumEasyPopupWindowPage.noThanksBtn));
		seleniumEasyPopupWindowPage.noThanksBtn.click();

		driver.switchTo().window(mainWindow);
		
}
	
	@AfterMethod
	
	public void closeBrowser() {
		driver.quit();
	}
	
	
	@Test
	public void validateAlert() throws InterruptedException
	{
		driver= DriverFactory.getDriver();
		
		driver.navigate().to("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		SeleniumEasyPopupWindowPage seleniumEasyPopupWindowPage = new SeleniumEasyPopupWindowPage(driver);
		
		seleniumEasyPopupWindowPage.clickMeBtn.click();
		
		Thread.sleep(6000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();//ok
		alert.dismiss();//cancel
		alert.getText();// get Message from Alert
		
	}
}
