package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingDataFromProperties {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.saucedemo.com/v1/");

	//hard coding
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();*/
		
		//Steps to data from properties file
		//Step 1
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Documents\\ddt.properties.txt"); // we should add extension like txt
		
		//Step 2: Loading data into properties class
		Properties pro = new Properties();
		pro.load(fis);
		
		//Step 3: get Property data key
		String URL = pro.getProperty("url");
		
		String USERNAME = pro.getProperty("usename");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);

		driver.findElement(By.name("user-name")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
		
		

	}

}
