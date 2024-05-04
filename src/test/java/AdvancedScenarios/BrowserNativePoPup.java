package AdvancedScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNativePoPup {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.amazon.in/");

	}

}
