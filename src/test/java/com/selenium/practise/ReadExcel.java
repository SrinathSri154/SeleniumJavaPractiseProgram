package com.selenium.practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	static void readexcel(int sheetnum,int rownum, int cellnum ) {
		
		File file = new File("C:\\Users\\goturi\\Downloads\\Testing.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheetAt(sheetnum);	
			String data = sh.getRow(rownum).getCell(cellnum).getStringCellValue();
			
			System.out.println("Cell value is :" + data);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		readexcel(0,0,0);
		
	}

}
