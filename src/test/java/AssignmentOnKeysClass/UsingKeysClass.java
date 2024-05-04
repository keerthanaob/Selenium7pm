package AssignmentOnKeysClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingKeysClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skillrary.com/user/register");
		driver.findElement(By.xpath("//a[text()='X']")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hi",Keys.TAB,"Q",Keys.TAB,"abc@gmail.com",
				Keys.TAB,Keys.TAB,"9176970912",Keys.TAB,"012345",Keys.TAB,"012345",Keys.TAB);
		
		driver.findElement(By.xpath("(//input[@type='password']/following::div)[2]")).click();//for clicking on im not a robot
		
		
	}

}
