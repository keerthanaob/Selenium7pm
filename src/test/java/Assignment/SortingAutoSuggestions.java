package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortingAutoSuggestions {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement> allsug = driver.findElements(By.xpath("//div[@id='Alh6id']//li"));
		
		ArrayList ar=new ArrayList(); //using arrayList() to get auto suggestions list
		
		for (WebElement su : allsug) 
		{
			ar.add(su.getText());
		}
		System.out.println(ar);
		
		Collections.sort(ar); //using sorting to get Ascending order
		
		System.out.println(ar);
		
		driver.close();
	}

}
