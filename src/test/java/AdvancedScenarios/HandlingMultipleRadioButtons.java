package AdvancedScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleRadioButtons {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> allRadioButtons = driver.findElements(By.xpath("//li[@class='answer']//label"));
		
		//int count=0;
		for (WebElement Radiobuttons : allRadioButtons) 
		{
			Radiobuttons.click();
			System.out.println(Radiobuttons.getText());
			//count++;
			
		}
		
	}

}
