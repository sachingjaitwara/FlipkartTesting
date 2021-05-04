package com.project_name.genericlib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Sachin gupta
 *
 */
public class Utilities {
	/**
	 * to wait explicitly for an element 
	 * @param driver
	 * @param ele
	 */
	public void explicitWait(WebDriver driver,WebElement ele) {
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(ele));
	}
	/**
	 * to handle dropdown
	 * @param ele
	 * @param text
	 */
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	/**
	 * to handle mouse hover
	 * @param driver
	 * @param ele
	 */
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	/**
	 * to handle double click
	 * @param driver
	 */
	public void doubleClick(WebDriver driver) {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
	}
	/**
	 * to handle right click
	 * @param driver
	 */
	public void rightClick(WebDriver driver) {
		Actions a=new Actions(driver);
		a.contextClick().perform();
	}
	/**
	 * to handle drag and drop
	 * @param driver
	 * @param src
	 * @param dest
	 */
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src,dest).perform();
	}
	/**
	 * to handle scrollbar
	 * @param driver
	 * @param x
	 * @param y
	 * @throws InterruptedException 
	 */
	public void scrollTo(WebDriver driver,int x,int y) throws InterruptedException {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo("+x+","+y+")");
		Thread.sleep(1000);
	}
	/**
	 * to handle alert popup
	 * @param driver
	 */
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * to handle child browser popup and return addres of child browser
	 * @param driver
	 * @return
	 */
	public String childBrowserPopup(WebDriver driver) {
		String child=driver.getWindowHandle();
		return child;
	}
	/**
	 * to handle child browser popup and return addres of child as well as parent browser
	 * @param driver
	 * @return
	 */
	public Set <String> childParentBrowserPopup(WebDriver driver) {
		Set <String> parent=driver.getWindowHandles();
		return parent;
	}
	/**
	 * to handle frame with index
	 * @param driver
	 * @param index
	 */
	public void frameByIndex(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * to handle child window popup
	 * @param driver
	 * @param address
	 */
	public void handleWindow(WebDriver driver,String address) {
		driver.switchTo().window(address);
	}

}








