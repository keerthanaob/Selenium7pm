package AdvancedScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownsUsingKeysClass {

	public static void main(String[] args) throws Throwable  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		
		WebElement dayList = driver.findElement(By.id("day"));
		dayList.click();
		
		//To scroll up and down 
		dayList.sendKeys(Keys.ARROW_UP);
		dayList.sendKeys(Keys.ARROW_UP);
		dayList.sendKeys(Keys.ARROW_UP);
		
	     Thread.sleep(2000);
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		
		//To select month
		WebElement monthList = driver.findElement(By.id("month"));
		monthList.click();
		monthList.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);
	
	
	}

}
