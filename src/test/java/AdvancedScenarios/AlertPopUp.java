package AdvancedScenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class AlertPopUp {
	
	public void AlertPopUp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Approach used for Alert Accept(click ok)
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alt = driver.switchTo().alert();*/
		//alt.accept();
		
		//The Approach is used to print Alert message in console
		/*String text = alt.getText();
		System.out.println(text);*/
		
		//Approach is used for Alert Accept or Dismiss(Click OK or Cancel)
		/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert al = driver.switchTo().alert();*/
		//al.accept();
		//al.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Qspiders");
		alert.accept();

	}

}
