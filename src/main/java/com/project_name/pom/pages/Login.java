package com.project_name.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement emailtb;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordtb;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginbtn;
	
	public Login(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getemailtb() {
		return emailtb;
	}
	
	public WebElement getpasswordtb() {
		return passwordtb;
	}
	
	public void signInbtn() {
		loginbtn.click();
	}

}
