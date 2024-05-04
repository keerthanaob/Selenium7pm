package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kayak.com");
		
		driver.findElement(By.xpath("//*[name()='svg' and @class='c8LPF-icon']")).click();
		

	}

}
