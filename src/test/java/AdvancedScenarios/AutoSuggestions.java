package AdvancedScenarios;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://demo.automationtesting.in/AutoComplete.html");
		
		driver.findElement(By.id("searchbox")).sendKeys("au");
		Thread.sleep(2000);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@role='presentation']//a"));
		
		for (WebElement Autosugge : suggestions) 
		{
			System.out.println(Autosugge.getText());
		}
		driver.close();*/
		
		/*driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Fashion");
		Thread.sleep(2000);
		
		List<WebElement> allList = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		
		for (WebElement list : allList) 
		{
			System.out.println(list.getText());
			
			if(list.getText().contains("fashion jewellery for women"))
			{
			list.click();
			break;*/
		
		driver.get("https://www.flipkart.com/");
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
		
		driver.findElement(By.name("q")).sendKeys("puma");
		
		//List<WebElement> allList = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc']//li"));
		
		for (WebElement all : ele) 
		{
			System.out.println(all.getText());
			
			if(all.getText().contains("puma shoes\r\n" + 
					"in Women's Footwear"))
			{
				all.click();
				break;
			}
		}
		}
}

