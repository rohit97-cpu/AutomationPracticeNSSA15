package com.ty.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(id = "search_query_top")
	private WebElement searchtb;

	@FindBy(name = "submit_search")
	private WebElement searchBtn;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public Resultspage search(String keys,WebDriver driver)
	{
		searchtb.sendKeys(keys);
		searchBtn.click();
		return new Resultspage(driver);
	}

}
