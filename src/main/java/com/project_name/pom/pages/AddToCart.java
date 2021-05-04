package com.project_name.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocart;
	
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement addToCart() {
		return addtocart;
	}

}
