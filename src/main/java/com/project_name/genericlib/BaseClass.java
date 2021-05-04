package com.project_name.genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * 
 * @author Sachin gupta
 *
 */
public class BaseClass implements AutoConstants{
	public WebDriver driver;
	public PropertiesFileData p;
	public Photo p1;
	public Utilities u=new Utilities();
	/**
	 * to open application with given url 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException {
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		p=new PropertiesFileData();
		driver.get(p.getPropertiesFileData("url"));
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	/**
	 * to close all windows and taking screenshot of failed testcases
	 * @param r
	 * @throws IOException
	 */
	@AfterMethod
	public void closeApp(ITestResult r) throws IOException {
		int status=r.getStatus();
		String name=r.getName();
		if(status==2) {
			p1=new Photo();
		    p1.getPhoto(driver, name);
		}
		driver.quit();
	}

}









