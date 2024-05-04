package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigatemetods {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
