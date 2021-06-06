package com.ty.ecommerce.scripts;

import org.testng.annotations.Test;

import com.ty.ecommerce.genericlibs.Baseclass;
import com.ty.ecommerce.pages.Homepage;
import com.ty.ecommerce.pages.ProductPage;
import com.ty.ecommerce.pages.Resultspage;

public class AddToCart extends Baseclass
{
	@Test
	public void addTocart()
	{
		Homepage hp=new Homepage(driver);
		Resultspage results = hp.search(p.getData("product"), driver);
		ProductPage pg = results.printedDress(driver);
		pg.IncreaseQuantity();
		utils.dropdown(pg.getSizedd(), p.getData("size"));
		pg.selectPinkColor();
		
	}

}
