package Project;

import org.apache.commons.lang3.SystemUtils;
//multiple imports(ctrl+shift+o)
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//Launch Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Method 1--->get()--Launch web application
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.makemytrip.com/flights/");
		
		//Method 2--->getTitle()--Title of page
		String Title=driver.getTitle();  
		System.out.println(Title);
		System.out.println("first test");
		System.out.println("Second test");
		System.out.println("Third test");
		
		//Method 3--->getCurrentUrl()--To get current url 
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//Method 4--->getPageSource()--To get source code
		//String code=driver.getPageSource();
		//System.out.println(code);
		
		//Method 5--->maximize() window
		driver.manage().window().maximize(); //To maximize window
		
		//driver.manage().window().minimize(); To minimize window
		
		//Method 6--->close()
		//driver.close();
		
		//Method 7--->quit()
		//driver.quit();
		
	
	}

}
