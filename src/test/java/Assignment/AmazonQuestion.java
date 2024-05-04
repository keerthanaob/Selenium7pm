package Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonQuestion {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> lin = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		
		for (WebElement link : lin) 
		{
			System.out.println(link.getText());
			String actData = link.getText();
			if(actData.contains("Canada"))
					{
				link.click();
					}
			}
				
		}

	}


