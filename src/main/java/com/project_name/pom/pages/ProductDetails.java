package com.project_name.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails {
	
	@FindBy(xpath="(//a[@class='_1fQZEK'])[2]")
	private WebElement product;
	
	public ProductDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement get2ndProduct() {
		return product;
	}

}
