package AdvancedScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ScrollByJavaScriptExecutor {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://www.amazon.in/");
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		
	/*	//for Scrolling down
		for(int i=0;i<3;i++) {
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		}
		
		//for scrolling down
		for(int i=0;i<3;i++) {
			jse.executeScript("window.scrollBy(0,-300)");
			Thread.sleep(1000);
		}*/
		
		//Approach -2
		driver.get("https://www.facebook.com/");
		
		//WebElement ele = driver.findElement(By.xpath("//a[text()='Games']"));
		/*Point loc = ele.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(666,786)");
		ele.click();*/
		
		//Approach -3 Without Co-ordinates
		
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()",ele);
		ele.click();*/
		
		//Approach -3 to scroll completely down and up
		
		JavascriptExecutor	jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //To scroll complete down
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)"); //To scroll complete up

	}

}
