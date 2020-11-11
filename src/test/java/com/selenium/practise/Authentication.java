package com.selenium.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {
	
	static WebDriver driver;
	
	public static void authentication(String username, String password, String url)
	{
		
		//String Url = "http://the-internet.herokuapp.com/basic_auth";
		String authn= "http://" + username + ":" + password + "@" + url;
		driver.get(authn);
		
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\goturi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		authentication("admin","admin","http://the-internet.herokuapp.com/basic_auth");
	}

}
