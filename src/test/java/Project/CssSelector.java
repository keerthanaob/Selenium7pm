package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Syntax1-[AttributeNAme="AttributeVAlue"]
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("[aria-label=\"Search Amazon.in\"]")).sendKeys("makeup");

		//driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standard_user");//saucedemo
		//driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("secret_sauce");//saucedemo
		
		//Syntax2-tagname[AttributeNAme="AttributeVAlue"]
		//driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_electronics\"]")).click();//amazon 
		
		//Syntax3-only for ID locator supports this shortcut - #Attribute
		driver.findElement(By.cssSelector("#user-name")).sendKeys("problem_user"); //saucedemo
		//Syntax4-only for ID locator supports this shortcut - tagname#Attribute
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");//saucedemo
		
		//Syntax5-only for CLASS locator supports this shortcut - .Attribute
		driver.findElement(By.cssSelector(".btn_action")).click();
		//Syntax6-only for CLASS locator supports this shortcut - tgname.Attribute
		//driver.findElement(By.cssSelector("input.btn_action")).click();
	}

}
