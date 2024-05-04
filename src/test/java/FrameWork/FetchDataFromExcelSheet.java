package FrameWork;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class FetchDataFromExcelSheet {

	public void FetchDataFromExcelSheet() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		 FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Book1.xlsx");
		 Workbook bo = WorkbookFactory.create(fis); // get inside file
		 Sheet sheet = bo.getSheet("Sheet1");
		 Row row = sheet.getRow(3);
		Cell cell = row.getCell(6);
		String ExcelData = cell.getStringCellValue();
		
		System.out.println(ExcelData);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ExcelData);
	}
}

