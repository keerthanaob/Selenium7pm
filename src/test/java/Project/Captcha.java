package Project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.Tesseract;

public class Captcha {

	public static void main(String[] args) throws Throwable {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		Thread.sleep(2000);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();
		
		Thread.sleep(2000);
		WebElement captcha = driver.findElement(By.xpath("//img[@class='captcha-img']"));
		
		TakesScreenshot ts = (TakesScreenshot)captcha;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./CaptchaScreenshot.png");
		FileUtils.copyFile(source, destination);
		
		Tesseract tss = new Tesseract();
		tss.setDatapath("C:\\Selenium\\Tess4J\\tessdata");
		String st = tss.doOCR(destination);
		String img = st.replaceAll(" ", "");
		System.out.println(img);
		
		driver.findElement(By.id("captcha")).sendKeys(img);
	}

}
