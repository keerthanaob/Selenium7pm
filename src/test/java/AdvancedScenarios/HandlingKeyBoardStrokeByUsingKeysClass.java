package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingKeyBoardStrokeByUsingKeysClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("secret_sauce",Keys.ENTER);*/
		
		//case:2
		//driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		
		//driver.get("https://www.amazon.in/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nike",Keys.ENTER);
		

	}

}
