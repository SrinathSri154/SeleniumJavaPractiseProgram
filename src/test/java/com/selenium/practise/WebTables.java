package com.selenium.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\goturi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://webdatacommons.org/webtables/");
		 
		// List<WebElement> row = driver.findElements(By.tagName("tr"));
		 
		
		 List<WebElement> row = driver.findElements(By.xpath("//div[@id='toccontent']/table[1]/tbody/tr[1]/th"));
		 System.out.println("Total columns present in first row :" + row.size());
		 String beforexpath = "//div[@id='toccontent']/table[1]/t	body/tr[1]/th[";
		 String afterxpath = "]";
		 for(int i=1; i<=row.size();i++) {
			String name = driver.findElement(By.xpath(beforexpath + i + afterxpath)).getText();
	        System.out.println(name);		 
	}
		driver.quit();

}
}
