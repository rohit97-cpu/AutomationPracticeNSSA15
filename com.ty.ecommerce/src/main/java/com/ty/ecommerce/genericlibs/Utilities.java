package com.ty.ecommerce.genericlibs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities 
{
	public void mouseHover(WebDriver driver,WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
	}
	
	public void dropdown(WebElement element,String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void switchToFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	public void scrollToElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

}
