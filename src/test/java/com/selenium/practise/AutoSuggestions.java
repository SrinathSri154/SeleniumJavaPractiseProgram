package com.selenium.practise;

import java.util.List;

import org.testng.annotations.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\goturi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.flipkart.com/");
// Alert alert = driver.switchTo().alert();
// alert.accept();
 WebElement popupwindow = driver.findElement(By.xpath(".//*[contains(@class,'_2AkmmA _29YdH8')]"));
 popupwindow.click();
 driver.findElement(By.xpath(".//*[@class='LM6RPg']")).sendKeys("samsung");
 //Thread.sleep(3000);
 List<WebElement> list =driver.findElements(By.xpath("//ul[@class='col-12-12 _1PBbw8 _26x3Jb']/li"));
// for (WebElement webElement : list) {
//  System.out.println(webElement.getText());
//  if(webElement.getText().trim().equals("selenium ide")) {
//   webElement.click();
//   break;
//  }
// }
 
 for(int i=0; i<list.size(); i++)
 {
	 String DropdownValues = list.get(i).getText();
	 System.out.println(DropdownValues);
 }
 


 Thread.sleep(3000);
 driver.quit();
}
}


