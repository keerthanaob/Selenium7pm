package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Lenovo/OneDrive/Documents/checkbox.html");
		
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[1]|(//input[@type='checkbox'])[2]")).click();
		
		//To select LAST checkbox
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[last()]")).click();
		
		//To select LAST BUT ONE checkbox
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[last()-1]")).click();
		
		//To select PARTICULAR checkbox
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[position()=5]")).click();
		
		//To select EVEN checkbox
		driver.findElement(By.xpath("(//input[@type='checkbox'])[position() mod 2=0]")).click();
		
		//To select ODD checkbox
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[position() mod 2=1]")).click();
		
	}

}
