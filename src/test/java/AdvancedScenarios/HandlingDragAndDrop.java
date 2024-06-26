package AdvancedScenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDragAndDrop {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html ");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		 Actions act = new Actions(driver);
		 
		 //act.dragAndDrop(drag, drop).perform();
		 
		 //or
		 
		 //act.clickAndHold(drag).perform();
		 //act.release(drop).perform();
		 
		 //or
		 act.clickAndHold(drag).release(drop).perform();
	}

}
