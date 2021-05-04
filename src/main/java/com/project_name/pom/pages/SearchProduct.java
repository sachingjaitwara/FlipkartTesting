package com.project_name.pom.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchtb;
	
	public SearchProduct(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void getSearchtb(String product) {
		searchtb.sendKeys(product);
		searchtb.sendKeys(Keys.ENTER);
	}
}
