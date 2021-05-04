package com.project_name.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterAndSort {
	
	@FindBy(xpath="(//select[@class='_2YxCDZ'])[1]")
	private WebElement minprice;
	
	@FindBy(xpath="(//select[@class='_2YxCDZ'])[2]")
	private WebElement maxprice;
	
	@FindBy(xpath="//div[@class='_3879cV']")
	private WebElement filpkartassured;
	
	@FindBy(xpath="//div[text()='SAMSUNG']")
	private WebElement samsung;
	
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	private WebElement sortl2h;
	
	@FindBy(xpath="//div[text()='Price -- High to Low']")
	private WebElement sorth2l;
	
	@FindBy(xpath="//div[text()='Color']")
	private WebElement expandcolor;
	
	@FindBy(xpath="//div[text()='Capacity']")
	private WebElement expandcapacity;
	
	@FindBy(xpath="//div[text()='251 - 300 L']")
	private WebElement get251to300l;
	
	@FindBy(xpath="//div[text()='Silver']")
	private WebElement silver;
	
	@FindBy(xpath="//div[text()='4★ & above']")
	private WebElement rating;
	
	public FilterAndSort(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getFlipkartAssured() {
		return filpkartassured;
	}
	
	public WebElement getSamsung() {
		return samsung;
	}
	
	public WebElement getMinPrice() {
		return minprice;
	}
	
	public WebElement getMaxPrice() {
		return maxprice;
	}
	
	public WebElement getSilverColor() {
		return silver;
	}
	
	public WebElement getExpandColor() {
		return expandcolor;
	}
	
	public WebElement getExpandCapacity() {
		return expandcapacity;
	}
	
	public WebElement get251To300L() {
		return get251to300l;
	}
	
	public WebElement getSortL2H() {
		return sortl2h;
	}
	
	public WebElement getSortH2L() {
		return sorth2l;
	}
	
	public WebElement getRating() {
		return rating;
	}

}
