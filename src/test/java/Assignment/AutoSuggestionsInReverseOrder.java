package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionsInReverseOrder {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		
		driver.findElement(By.id("searchbox")).sendKeys("gu");
		Thread.sleep(2000);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@role='presentation']//a"));
		
	   ArrayList ar=new ArrayList(); //using ArrayList 
	    
		for (WebElement autosu : suggestions) 
		{
			ar.add(autosu.getText());
			//System.out.println(autosu.getText());	
		}
		System.out.println(ar);
		
		Collections.reverse(ar); //using reverse method in collections
		
		System.out.println(ar);
		
           driver.close();    
	}

}
