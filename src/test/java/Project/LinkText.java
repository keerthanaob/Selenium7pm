package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		//driver.findElement(By.linkText("Today's Deals")).click();
		
		driver.findElement(By.partialLinkText("Today's")).click();
//start tag is 'a' we can directly copy text
	}

}
