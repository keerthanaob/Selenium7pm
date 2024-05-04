package AdvancedScenarios;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		WebElement txt = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(txt).perform();
		
		driver.findElement(By.xpath("//div[text()='Jobs by skill']")).click();
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
		String mainId = driver.getWindowHandle(); //win 1
		System.out.println(mainId);
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		
		for (String id : allId) 
		{
			if(!mainId.equals(id))
			{
			driver.switchTo().window(id);
			driver.findElement(By.xpath("//span[text()='COMBO PACKS']")).click();
			}
		}
		driver.switchTo().window(mainId); //back to win 1
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='All Jobs'])[2]")).click();  // in win 1 alljobs element
	}

}
