package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import pageObject file
import PageObject.GoogleSearchPage;

public class GoogleSearchTest {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath+"/driver/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("reddit");
		GoogleSearchPage.textbox_search(driver).sendKeys(Keys.RETURN);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.close();
		driver.quit();
	}

}
