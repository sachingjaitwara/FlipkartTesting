package com.project_name.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShareProduct {
	
	@FindBy(xpath="//span[text()='Share']")
	private WebElement sharebtn;
	
	@FindBy(xpath="//img[@alt='Facebook']")
	private WebElement facebook;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement facebookemail;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement facebookpass;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement facebooklogin;
	
	@FindBy(xpath="//span[text()='Post to Facebook']")
	private WebElement posttofacebook;
	
	public ShareProduct(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getShareBtn() {
		return sharebtn;
	}
	
	public WebElement getFacebook() {
		return facebook;
	}
	
	public WebElement getFacebookEmail() {
		return facebookemail;
	}
	
	public WebElement getFacebookPass() {
		return facebookpass;
	}
	
	public WebElement facebooklogin() {
		return facebooklogin;
	}
	
	public WebElement postToFacebook() {
		return posttofacebook;
	}

}












