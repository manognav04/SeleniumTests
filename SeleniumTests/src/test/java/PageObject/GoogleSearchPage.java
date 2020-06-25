package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	static WebElement element = null;
	
	WebDriver driver = null;
	
	By textbox_Search = By.name("q");
	By button_Search = By.name("btnk");
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchWithTextInput(String text) {
		driver.findElement(textbox_Search).sendKeys(text);
		driver.findElement(textbox_Search).sendKeys(Keys.ESCAPE);
	}
	
	public void clickSearchButton() {
		driver.findElement(textbox_Search).sendKeys(Keys.ENTER);
	}

}
