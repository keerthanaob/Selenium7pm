package Assignment;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAssignment {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://student.qspiders.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("7901526873");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Keerthana@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Drop down by Xpath
		/*driver.findElement(By.xpath("//span[.='keerthana ']")).click();
		driver.findElement(By.xpath("//label[.='Course Details']")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();*/
		
		//By keysClass
		/*WebElement ele = driver.findElement(By.xpath("//span[.='keerthana ']"));
		ele.click();
		
		Thread.sleep(2000);
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ARROW_UP);*/
		
		//By Robot class
		/*WebElement ele1 = driver.findElement(By.xpath("//span[.='keerthana ']"));
		ele1.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);*/
		
		//By select class
		WebElement ele2 = driver.findElement(By.xpath("//span[.='keerthana ']"));
		Select se = new Select(ele2);
		se.selectByVisibleText("Add Contact");
		
		
		
		
		
		
		

	}

}
