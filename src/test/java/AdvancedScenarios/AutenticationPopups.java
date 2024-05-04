package AdvancedScenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class AutenticationPopups {

	public void AutenticationPopups() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	

	}

}
