package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.amazon.in/");
		
		WebElement a = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-amazonprime']"));
		
	  Actions act = new Actions(driver);
	  //to move to particular element
	  //act.moveToElement(a).perform();
	  
	  //Right click on yhe particula element
	  act.contextClick(a).perform();*/
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));
	  
		Actions act = new Actions(driver);
		act.sendKeys(UserName, "standard_user").perform();
		act.sendKeys(Password, "secret_sauce").perform();
		act.sendKeys(login).click().perform();
		 //or
		//act.click(login).perform();
		
		//or
		//act.sendKeys(UserName, "locked_out_user").sendKeys(Password, "secret_sauce").click(login).build().perform();
	
	  

	}

}
