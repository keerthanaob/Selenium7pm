package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAutoSuggestions {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(2000);

		List<WebElement> allsu = driver.findElements(By.xpath("//div[@class='mkHrUc']//li"));
		
		for (WebElement googlesu : allsu) 
		{
			System.out.println(googlesu.getText());
		}
		
		driver.close();
	}

}
