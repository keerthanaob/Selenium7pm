package AdvancedScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingRobotClass {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
         driver.findElement(By.xpath("//a[.='Create new account']")).click();
		
       //To select date
		WebElement dayList = driver.findElement(By.id("day"));
		dayList.click();
		
		 Robot r = new Robot();
		 
		 r.keyPress(KeyEvent.VK_UP);
		 r.keyRelease(KeyEvent.VK_UP);
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
		//To select Month
		 WebElement monthList = driver.findElement(By.id("month"));
		 monthList.click();
		 
		 r.keyPress(KeyEvent.VK_UP);
		 r.keyRelease(KeyEvent.VK_UP);
		 
		 //To select Year
		 WebElement yearList = driver.findElement(By.id("year"));
		 yearList.click();
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 

			
		
			
			
	

	}

}
