package AdvancedScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();*/
		
		//switching frame by using index value
		/*driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame(0); //index value is 0
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("QSpiders");*/
		
		//Using Id and name attribute
		/*driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe"); // using Id Attribute
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Keerthana");*/
		
		//Switching frame by using WebElement
		/*driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement text = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(text);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("KEERTHANA");*/
		
		//Frame inside a frame
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Keertana");
		
		

	}

}
