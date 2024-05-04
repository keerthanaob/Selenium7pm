package Project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1Oncss {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("span._30XB9F")).click();
		//driver.findElement(By.cssSelector("[alt=\"Mobiles & Tablets\"]")).click();
		//String Text=driver.findElement(By.cssSelector("._3vKRL2")).getText();
		//System.out.println(Text);
		//driver.findElement(By.cssSelector("[alt=\"iPhone\"]")).click();
		//String pohnetext=driver.findElement(By.cssSelector("[data-id=\"MOBGZCQMHGWDYZQ7\"]")).getText();
		//System.out.println(pohnetext);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Bluetooth");
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
		String name = driver.findElement(By.xpath("//span[contains(text(),'Apple Headphones Wired Earbuds with Lightning')]")).getText();
		System.out.println(name);
		
	    String price = driver.findElement(By.xpath("(//span[text()='899'])[1]")).getText();
		System.out.println(price);
	    
		//String Price=driver.findElement(By.className("a-price-whole")).getText();
		//System.out.println(Price);
		
	}

}
