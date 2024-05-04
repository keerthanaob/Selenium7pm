package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://skillrary.com/user/register");
		//driver.findElement(By.xpath("//a[.='X']")); // to close the popup
		/*WebElement radiobutton = driver.findElement(By.id("usertype_yes"));
		Thread.sleep(3000);
		radiobutton.click();
		if (radiobutton.isSelected()) 
		{
			System.out.println("Radiobutton is selected");
		} 
		else 
		{
            System.out.println("Radiobutton is not selected");
		}*/
		
		driver.get("https://www.amazon.in/");
		
		/*WebElement data = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		System.out.println(data.getAttribute("class"));
		System.out.println(data.getAttribute("data-csa-c-id"));
		
		WebElement tagname = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println(tagname.getTagName());
		
		WebElement tagna = driver.findElement(By.id("nav-search-bar-form"));
		System.out.println(tagna.getTagName());
		
		WebElement name = driver.findElement(By.cssSelector("[autocomplete=\"off\"]"));
		System.out.println(name.getAccessibleName());
		
		WebElement na = driver.findElement(By.linkText("Today's Deals"));
		System.out.println(na.getAccessibleName());*/
		
		/*driver.get("https://skillrary.com/user/register");
		driver.findElement(By.xpath("//a[.='X']")).click();
		Thread.sleep(2000);
		
		WebElement radio = driver.findElement(By.id("usertype_yes"));
		System.out.println(radio.getAriaRole());
		
		//Thread.sleep(2000);
		WebElement textbox = driver.findElement(By.name("email"));
		System.out.println(textbox.getAriaRole());*/
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		System.out.println(element.getDomAttribute("data-csa-c-type"));
		
		WebElement value = driver.findElement(By.xpath("//a[@aria-label='Amazon.in']"));
		System.out.println(value.getDomProperty("ariaLabel"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
