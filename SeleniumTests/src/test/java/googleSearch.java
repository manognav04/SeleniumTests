import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", "/Users/manognav/git/SeleniumTests/SeleniumTests/driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.close();
	}

}
