package AdvancedScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByRobotClass {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		 Robot r = new Robot();
		 
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_PAGE_UP);
		 r.keyRelease(KeyEvent.VK_PAGE_UP);
		 
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_PAGE_UP);
		 r.keyRelease(KeyEvent.VK_PAGE_UP);
		 
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_PAGE_UP);
		 r.keyRelease(KeyEvent.VK_PAGE_UP);
		
	}

}
