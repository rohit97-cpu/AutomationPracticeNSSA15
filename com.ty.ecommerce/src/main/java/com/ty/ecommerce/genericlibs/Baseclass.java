package com.ty.ecommerce.genericlibs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass 
{
	public WebDriver driver;
	public Propertyfiledata p=new Propertyfiledata();
	public photo photo=new photo();
	public Utilities utils=new Utilities();
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(AutoConstants.CHROMEKEY, AutoConstants.CHROMEVALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}
	
	@AfterMethod
	public void closeApp(ITestResult result)
	{
		int status=result.getStatus();
		
		if (status==2) {
			photo.getPhoto(driver, result.getName());
		}else {
			driver.quit();
		}
	}
	

}
