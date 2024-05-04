package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsertDataToExcel {

	public static void main(String[] args) throws Throwable  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		 FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\Book1.xlsx");
		 Workbook bo = WorkbookFactory.create(fis); // get inside file
		 Sheet sheet = bo.getSheet("Sheet1");
		 Row row = sheet.createRow(2);
		 Cell cell = row.createCell(4);
		 cell.setCellValue("Keertana");
		 
		 FileOutputStream file = new FileOutputStream("C:\\\\Users\\\\Lenovo\\\\OneDrive\\\\Desktop\\\\Book1.xlsx");
		 bo.write(file);
		 bo.close();
	}

}
