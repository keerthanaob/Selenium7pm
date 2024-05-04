package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDoubleAndRightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
			WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
			
			Actions act = new Actions(driver);
			
			act.doubleClick(ele).perform();
			
			act.contextClick(ele).perform();

	}

}
