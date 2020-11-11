package com.selenium.practise;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWindowsTabs {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Headless");
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\goturi\\Desktop\\chromedriver\\chromedriver.exe");

		String Url = "https://www.facebook.com/";
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> windows =driver.getWindowHandles();
		for(String address : windows)
		{
			
		System.out.println("All windows address are :" + address);
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\goturi\\eclipse-workspace\\SeleniumJavaPractiseProgram\\screenshot\\Headless.png"));
			
		}
		
//		Iterator<String> address = windows.iterator();
//		String parent = address.next();
//	    System.out.println("parent window address is :" +parent);
//		Iterator<String> address = windows.iterator();
//		String child1 = address.next();
//		 System.out.println("Child1 window address is :" +child1);
//		Iterator<String> itr1 = windows.iterator();
//		String child2 = itr1.next();
//		 System.out.println("child2 window address is :" +child2);
//		Iterator<String> itr2 = windows.iterator();
//		String child3 = itr2.next();
//		 System.out.println("child3 window address is :" +child3);
		
		driver.quit();
	}

}
