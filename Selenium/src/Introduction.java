import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {
	public static void main(String args[]) {
		
		
		
		System.setProperty("webdriver.crome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
}
