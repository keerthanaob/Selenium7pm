package AdvancedScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpath {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		String month = "December 2023";
		String date = "25";

		//driver.findElement(By.xpath("//div[text()='December 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='14']")).click();
		   //or
		
		//Dynamic Xpath
		driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
	}

}
