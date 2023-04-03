package utility;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class DriverFactory {
	
	
	public static ChromeDriver getDriver() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\TIRATH\\Downloads\\chromedriver_win32 (2)/chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver  driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
     
        
        return driver;
	}

}
