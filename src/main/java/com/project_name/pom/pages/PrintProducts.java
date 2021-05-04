package com.project_name.pom.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintProducts {
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	private List<WebElement> products;
	
	public PrintProducts(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public List<WebElement> getProducts() {
		return products;
	}

}
