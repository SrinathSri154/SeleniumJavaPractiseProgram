package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
@Test(dataProvider="dataprovider")
public void data(String username, String password)
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\goturi\\Desktop\\chromedriver\\chromedriver.exe");

	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    driver.findElement(By.id("identifierId")).sendKeys(username);
    driver.findElement(By.xpath("//div[contains(@class,'VfPpkd-RLmnJb')]")).click();
    driver.findElement(By.xpath("(//input[contains(@class,'whsOnd zHQkBf')])[1]")).sendKeys(password);
    driver.findElement(By.xpath("//div[contains(@class,'VfPpkd-RLmnJb')]")).click();
    String title = driver.getTitle();
    System.out.println("Title of page is :" + title);
    driver.quit();
}

@DataProvider
public Object[][] dataprovider(){
	
	return new Object[][]
			{
		
		{"srinath154@gmail.com","9959538061"},
		{"sadadada","dadadadada"}
		};
}	
	

	

		
	
		
		
		
		
	

}
