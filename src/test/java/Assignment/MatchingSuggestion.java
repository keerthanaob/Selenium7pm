package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MatchingSuggestion {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement> allsug = driver.findElements(By.xpath("//div[@id='Alh6id']//li"));
		for (WebElement sug : allsug) 
		{
			System.out.println(sug.getText());
			if(sug.getText().equals("selenium webdriver"))
			{
				sug.click();
				break; // we use this keyword because... to not get stale element exception(old elements available)
			}
		}
		driver.close();
	
	}
}







