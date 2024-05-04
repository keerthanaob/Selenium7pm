package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		
		//Xpath by Attributes- Syntax 1
		//driver.findElement(By.xpath("//img[@alt='Great Indian Festival']")).click();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bluetooth");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//Syntax 2:by text()- //tagname[text()='Visible Text']
		//String Price=driver.findElement(By.xpath("(//span[text()='1,199'])[1]")).getText();
		//System.out.println(Price);
		//String Name=driver.findElement(By.xpath("//span[text()='truke Newly Launched Buds Vibe True Wireless "
		//		+ "in Ear Earbuds with 35dB Real ANC + Quad Mic ENC, 13mm Big Speaker, 4 EQ Modes, "
		//		+ "48H Playtime, Fast Charge, 40ms Low Latency, AAC Codec, BT 5.3, IPX5(Blue)']")).getText();
		//System.out.println(Name);
		
		//driver.findElement(By.xpath("//a[text()='Electronics']")).click();
		
		//Syntax 3:by contains()- //tagname[contains(@AttributeName,'AttributeValue')]
		//driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
		
	//driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("visual_user");
	//driver.findElement(By.xpath("//input[contains(@id,'p')]")).sendKeys("secret_sauce");
	//driver.findElement(By.xpath("//input[contains(@class,'submit-butto')]")).click();
		
	//driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,'nav_cs_new')]")).click();
	
	
	//Syntax 4:by contains text()- //tagname[contains(text(),'AttributeValue')]
	//driver.get("https://www.foundit.in/ ");
	//driver.manage().window().maximize();
	
	///driver.findElement(By.xpath("//div[contains(text(),' Upload Resume')]")).click();
	//driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();
		
		//Syntax 5:by Multiple operators- //tagname[@Attributename='Attributevalue' and @Attributename='Attributevalue'] both should true
		                                  //tagname[@Attributename='Attributevalue' or @Attributename='Attributevalue'] any one should true
		//driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='user-name' and @name='user-name']")).sendKeys("visual_user");
		//driver.findElement(By.xpath("//input[@id=\"password\" or @name=\"pa\"]")).sendKeys("secret_sauce");
		
		//Syntax 6:by Multiple operators- //tagname[@Attributename='Attributevalue' and text()='visibletext'] both should true
                                          //tagname[@Attributename='Attributevalue' or text()='visibletext'] any one should true
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav_cs_4\" and text()='Mobiles']")).click();
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav_cs_4\" and 'Mobiles']")).click();

	}

}

