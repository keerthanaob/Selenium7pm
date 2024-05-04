package AdvancedScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNativePopUps {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-Notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.irctc.co.in/nget/train-search");

	}

}
