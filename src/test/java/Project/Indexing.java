package Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Indexing {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//img[@class=\"_2puWtW _3a3qyb\"])[2]")).click();
		Thread.sleep(4000);
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iPhone");
		search.submit(); // directly it will navigate to the phones page
		
		//Thread.sleep(2000);
		//String PhName = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']")).getText();
		//System.out.println(PhName);
		
		//String Price = driver.findElement(By.xpath("//div[text()='₹57,999']")).getText();
		//System.out.println(Price);
	
		Thread.sleep(3000);
		List<WebElement> PhNames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		for (WebElement name : PhNames) 
		{
			String Phonename = name.getText();
			System.out.println(Phonename);
		}
		
		List<WebElement> PhonePrices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		for (WebElement price : PhonePrices) 
		{
			String PhonePrice = price.getText();
			System.out.println(PhonePrice);
		}
	
	}
}
