package AdvancedScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultilpeWebElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count=0;
		for (WebElement link : allLinks) 
		{
			System.out.println(link.getText());
			count++;
		}
		System.out.println("Total number of links:"+count);

	}

}
