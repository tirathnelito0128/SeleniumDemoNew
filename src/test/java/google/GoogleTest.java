package google;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;
import utility.DriverFactory;

public class GoogleTest {
	
	WebDriver driver=null;
	
	@Test
	public void testGoogle() throws InterruptedException
	{
		driver= DriverFactory.getDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("http://demo.seleniumeasy.com/basic-first-form-demo.html");
		Thread.sleep(10000);
		WebElement messageInput=	driver.findElement(By.id("user-message"));
		messageInput.sendKeys("TestMessageTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
	
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button")));
	WebElement showBtn=	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button"));
	
	showBtn.click();
	
	WebElement displayElement = driver.findElement(By.id("display"));
	displayElement.sendKeys("Tirath");
	
	String s=	displayElement.getText();
	
		if(s.equals("TestMessageTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		
	}
	
	@AfterMethod
	
	public void closeBrowser() {
		System.out.println("After Method===============");
		driver.close();
	}
	
	
	@Test
	public void testGoogleSearch()
	{
		driver= DriverFactory.getDriver();
		GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
		driver.get("https://www.google.com/");
		googleSearchPage.googleSearchInput.sendKeys("SeleniumEasy");
	}
	
}
