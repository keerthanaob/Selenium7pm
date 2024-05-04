package AdvancedScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownsUsingSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
         driver.findElement(By.xpath("//a[.='Create new account']")).click();
		
       //To select date
         WebElement dayList = driver.findElement(By.id("day"));
          Select select1 = new Select(dayList);
        //select1.selectByIndex(14);
          //select1.selectByValue("10");
          select1.selectByVisibleText("9");
        
      //To select Month
        WebElement month = driver.findElement(By.id("month"));
        Select select2 = new Select(month);
        //select2.selectByIndex(5);
        //select2.selectByValue("9");
        select2.selectByVisibleText("May");
        
      //To select Year
        WebElement yearList = driver.findElement(By.id("year"));
        Select select3 = new Select(yearList);
        //select3.selectByIndex(1);
        //select3.selectByValue("2000");
        select3.selectByVisibleText("2001");
        

	}

}
