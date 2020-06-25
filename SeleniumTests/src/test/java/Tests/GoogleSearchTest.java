package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import pageObject file
import PageObject.GoogleSearchPage;

public class GoogleSearchTest {
	
	static WebDriver driver = null;
		
	@BeforeTest
	public void browserLaunch() {
		
		
		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath+"/driver/chromedriver");
		
		driver = new ChromeDriver();
		
	}
	
	@Test
	public static void googleSearch() {
	
		GoogleSearchPage pageObject = new GoogleSearchPage(driver);
		
		driver.get("https://www.google.com");
	
		pageObject.searchWithTextInput("reddit");
		pageObject.clickSearchButton();
	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	}
	
	@AfterTest
	public void closeBroswer() {
		
		
		driver.close();
		driver.quit();
		
		}
}


