package AdvancedScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveByOffSet {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.makemytrip.com/");
		
		driver.get("https://www.flipkart.com/");
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
		
		
		

	}

}
