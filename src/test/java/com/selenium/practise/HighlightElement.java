package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HighlightElement {
	static WebDriver driver;
	
	public static void highlight(WebDriver driver, WebElement element)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow; border: 2px solid red;');", element);
		
	}

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.setCapability(ChromeOptions.CAPABILITY,"Disable-infobars");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\goturi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		
		driver = new ChromeDriver();
		driver.manage().window().maximize();       
		//WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		WebElement ele = driver.findElement(By.xpath("(//div[@class='BHzsHc'][1])"));
		
		WebElement elemnt = driver.findElement(By.xpath("//*[@id='identifierId']"));
		elemnt.clear();
		highlight(driver,elemnt);
		elemnt.sendKeys("srinath154@gmail.com");
		driver.close();
	}

}
