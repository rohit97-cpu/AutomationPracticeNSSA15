package com.ty.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resultspage 
{
	@FindBy(xpath = "(//a[@href=\"http://automationpractice.com/index.php?id_product=4&controller=product&search_query=dress&results=7\"])[4]")
	private WebElement PrintedDressLink;
	
	public Resultspage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public ProductPage printedDress(WebDriver driver)
	{
		PrintedDressLink.click();
		
		return new ProductPage(driver);
	}
	
}
