package AdvancedScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingRobotClass {

	public static void main(String[] args) throws Throwable  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("Keerthana");
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL); //for selecting the text we used ctrl, and ctrl A
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_CONTROL); // for copying the text
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		r.keyPress(KeyEvent.VK_TAB); // for moving next element we use TAB
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL); // for pasting the text
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

}
