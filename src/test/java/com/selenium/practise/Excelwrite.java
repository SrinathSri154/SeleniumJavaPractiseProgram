package com.selenium.practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelwrite {
	
	static WebDriver driver;
	
	static void writetoexcel(int sheetnum, int rownum, int cellnum, String passvalue) throws IOException
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\goturi\\Downloads\\Testing.xlsx");
		XSSFWorkbook xs = new XSSFWorkbook(fis);
		XSSFSheet sheet = xs.getSheetAt(sheetnum);
		sheet.getRow(rownum).getCell(cellnum).setCellValue(passvalue);
		//XSSFCell cell = row.getCell(cellnum);
	    //cell.setCellValue(passvalue);
		FileOutputStream fout = new FileOutputStream("C:\\Users\\goturi\\Downloads\\Testing.xlsx");
		xs.write(fout);
		xs.close();
		
	}

	public static void main(String[] args) throws IOException {

		
//System.setProperty("webdriver.chrome.driver","C:\\Users\\goturi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com");v
//		String pagetitle = driver.getTitle();
		writetoexcel(0,0,0,"pagetitle");
		//driver.close();
	}

}
