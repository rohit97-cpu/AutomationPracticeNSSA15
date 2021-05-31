package com.ty.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	@FindBy(xpath = "//i[@class=\"icon-plus\"]")
	private WebElement plusbtn;
	
	@FindBy(id = "group_1")
	private WebElement Sizedd;
	
	@FindBy(xpath = "//a[@title=\"Pink\"]")
	private WebElement Pinkcolor;
	
	public WebElement getAddtocart() {
		return Addtocart;
	}

	@FindBy(name = "Submit")
	private WebElement Addtocart;
	
	public ProductPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	
	public void IncreaseQuantity()
	{
		plusbtn.click();
	}

	public WebElement getSizedd() {
		return Sizedd;
	}
	
	public void selectPinkColor()
	{
		Pinkcolor.click();
	}
	
	public void AddToCart()
	{
		Addtocart.click();
	}
	
	 

}
