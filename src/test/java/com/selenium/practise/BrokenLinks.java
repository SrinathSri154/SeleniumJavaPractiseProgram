package com.selenium.practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks{

	public static void main(String[] args) throws MalformedURLException, IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\goturi\\Desktop\\chromedriver\\chromedriver.exe");

	String Url = "https://www.facebook.com/";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	HttpURLConnection https = null;
    int responsecode,count=0;
    String reponsemessage;
    int countvalid=0;
    driver.get(Url);
    List<WebElement> links = driver.findElements(By.tagName("a"));
    links.addAll(driver.findElements(By.tagName("img")));
    System.out.println("The Total links present in webpage :" + links.size());
    List<WebElement> activelinks = new ArrayList<WebElement>();
    
    for(int i=0;i<links.size();i++) {
    	
    	
    	 if(links.get(i).getAttribute("href")!=null &&(!links.get(i).getAttribute("href").contains("javascript")))
    	 {
    		 
    		 activelinks.add(links.get(i));
    		 
    	 }
    }
    
	 System.out.println("The Total Activelinks present in webpage :" + activelinks.size());

    Iterator<WebElement> itr = activelinks.iterator();
    while(itr.hasNext())
    {
    	Url = itr.next().getAttribute("href");
    	https = (HttpURLConnection)(new URL(Url).openConnection());
    	https.setRequestMethod("HEAD");
    	https.connect();
    	responsecode = https.getResponseCode();
        reponsemessage = https.getResponseMessage();
    	if(responsecode>=400)
    	{
    		System.out.println(Url + " is broken link" + " ----->" + reponsemessage);
    	count++;
    	}
    	else {
    		
    		System.out.println(Url + " is valid link" + " ----->" + reponsemessage);
    		countvalid++;
    	}
    
    }
	System.out.println("There are " + countvalid + " valid links in the web page");

    
    System.out.println("Ther are " + count + " broken links present in the web page");	
    
   driver.quit();
	
	}	
}