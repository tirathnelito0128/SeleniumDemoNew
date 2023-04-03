package login;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.RegistrationPage;
import utility.DriverFactory;
import utility.ExcelReader;

public class RegistrationTest {
	

	@Test(groups = {"regression","smoke"})
	public void testInputForm()
	{
		ChromeDriver driver= DriverFactory.getDriver();
		ExcelReader reader = new ExcelReader();
	Map<String,String>	dataMap=reader.readTestDataFromExcel();
	RegistrationPage rp = new RegistrationPage(driver);
		// driver.get("https://www.google.com");
		driver.navigate().to("http://demo.seleniumeasy.com/input-form-demo.html");
		
		
		rp.firstNameInput.sendKeys(dataMap.get("FirstName"));
		
		
		rp.lastNameInput.sendKeys(dataMap.get("LastName"));
		
		
		rp.emailInput.sendKeys(dataMap.get("Email"));
		
		
		rp.phoneInput.sendKeys(dataMap.get("PhoneNo"));
		
		
		rp.address.sendKeys("Noida");
		
		
		rp.city.sendKeys("Ghaziabad");
		
		
		
		
		Select select = new Select(rp.stateInput);
		select.selectByIndex(4);
		//select.selectByValue(null);
		//select.selectByVisibleText("California");
		
		WebElement zip= driver.findElement(By.xpath("//input[@name='zip']"));
		zip.sendKeys("201010");
		
		WebElement websiteDomain= driver.findElement(By.xpath("//input[@name='website']"));
		websiteDomain.sendKeys("www.demo.seleniumeasy.com");
		
		WebElement hosting= driver.findElement(By.xpath("//input[@name='hosting' and @value='yes']"));
		hosting.click();
		
		WebElement projectDescription= driver.findElement(By.xpath("//textarea[@name='comment']"));
		projectDescription.sendKeys("Test Demo");
		
		WebElement sendButton= driver.findElement(By.xpath("//button[text()='Send ']"));
		sendButton.click();
		
		driver.close();
		
	}
	

}
