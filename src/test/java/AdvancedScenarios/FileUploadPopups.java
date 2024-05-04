package AdvancedScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopups {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.foundit.in");
		
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		
		WebElement file = driver.findElement(By.id("file-upload"));
		file.sendKeys("G:\\Documents\\OBILI KEERTHANA.rtf"); // Location and file name with . extension
		Thread.sleep(2000);
		
		driver.findElement(By.id("pop_upload")).click();

	}

}
