package AdvancedScenarios;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitchingUsingTitle {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		Set<String> allId = driver.getWindowHandles();
		
		for (String id : allId) 
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.contains("Selenium"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
	}

}
