package com.panasonic.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebConnector {

	WebDriver driver;
	Properties OR=null;
	Properties CONFIG=null;
	
	public WebConnector(){

		if(OR==null){
			OR = new Properties();
			try {
				  FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\panasonic\\config\\OR.properties");
				  OR.load(fs);
				  
				  CONFIG=new Properties();
				  
				  fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\panasonic\\config\\env.properties");
				  CONFIG.load(fs);
				  
				  //System.out.println(OR.getProperty("HomePage_searchField"));
				  //System.out.println(CONFIG.getProperty("loginURL"));
				  
				  
			}catch(Exception e){
				
				  System.out.println("Error in initializing the properties");
				
			}
			
		}
	
	}
	
	public void openBrowser(String browserType){
		
		if(browserType.equals("Mozilla")){
			driver=new FirefoxDriver();
		}else if(browserType.equals("IE")){
			
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")  + "//driver//IEDriverServer.exe") ;
			driver=new InternetExplorerDriver();
			
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	}
	
	public void navigate(String URL){
		
		driver.get(CONFIG.getProperty(URL));
	}
	
	public void click(String objectName){
		driver.findElement(By.xpath(OR.getProperty(objectName))).click();
		
	}
	
	
	public void enter(String objectName,String text){
		
		driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
	}
	
	public boolean verifyElementText(String objectName,String textToVerify){
		
		if((driver.findElement(By.xpath(OR.getProperty(objectName)))).getText().equals(textToVerify)){
		   return true;	
		}else
		   return false;
	
	}
	
	
}
