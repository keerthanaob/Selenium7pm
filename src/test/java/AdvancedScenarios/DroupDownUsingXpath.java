package AdvancedScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DroupDownUsingXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		
		//Date selecting
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[.='5']")).click();
		
		//Month selecting
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[.='May']")).click();
		
		//Year selecting
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[.='2015']")).click();
		

		
	}

}
