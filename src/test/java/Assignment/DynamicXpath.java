package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
		
		WebElement key = driver.findElement(By.name("q"));
		key.sendKeys("iphone");
		key.submit();
		
		WebElement text = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Black, 64 GB)']"
				+ "/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		String price = text.getText();
		System.out.println(price);
		
		

	}

}
