package Assignment;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveDuplicateValues {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement> allsug = driver.findElements(By.xpath("//div[@id='Alh6id']//li"));
		
		TreeSet ts=new TreeSet();//using Treeset() to remove duplicate values and also by default in ascending order
		
		for (WebElement sugg : allsug) 
		{
			System.out.println(sugg.getText());
			ts.add(sugg.getText());
		}
		System.out.println("---------------------------");
		for (Object obj : ts) 
		{
			System.out.println(obj);
		}
		driver.close();
	}
}
