package com.project_name.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.project_name.genericlib.BaseClass;
import com.project_name.pom.pages.AddToCart;
import com.project_name.pom.pages.FilterAndSort;
import com.project_name.pom.pages.Login;
import com.project_name.pom.pages.PrintProducts;
import com.project_name.pom.pages.ProductDetails;
import com.project_name.pom.pages.SearchProduct;
import com.project_name.pom.pages.ShareProduct;

public class SignIn extends BaseClass{
	
	@Test(priority=0)
	public void test1() throws FileNotFoundException, IOException, InterruptedException {
		Login l=new Login(driver);
		
		String emailadd = p.getPropertiesFileData("email");
		String pass = p.getPropertiesFileData("password");
		
		l.getemailtb().sendKeys(emailadd);
		l.getpasswordtb().sendKeys(pass);
		
		l.signInbtn();
		
		Thread.sleep(3000);
		
		
		SearchProduct s=new SearchProduct(driver);
		s.getSearchtb("refrigerator");
		Thread.sleep(3000);
		
		FilterAndSort f=new FilterAndSort(driver);
		f.getSamsung().click();
		Thread.sleep(1000);
		f.getFlipkartAssured().click();
		Thread.sleep(1000);
		f.getExpandColor().click();
		Thread.sleep(1000);
		f.getSilverColor().click();
		Thread.sleep(1000);
		f.getExpandCapacity().click();;
		Thread.sleep(1000);
		f.get251To300L().click();;
		Thread.sleep(1000);
		u.dropDown(f.getMinPrice(),"₹25000");
		Thread.sleep(1000);
		u.dropDown(f.getMaxPrice(),"₹30000");
		Thread.sleep(1000);
		f.getSortL2H().click();
		Thread.sleep(1000);
		f.getRating().click();
		Thread.sleep(2000);
		
		PrintProducts p1=new PrintProducts(driver);
		List<WebElement> productlist=p1.getProducts();
		System.out.println(productlist.size());

		ArrayList a=new ArrayList();

		for(WebElement product:productlist) {
			int x=product.getLocation().getX();
			int y=product.getLocation().getY();
			System.out.println(x+" "+y);
			try {
				u.scrollTo(driver, x, y);
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
			
			a.add(product.getText());
		}

		u.scrollTo(driver,0,0);
		
		Collections.sort(a);

		for(Object temp:a) {
			Reporter.log(temp.toString(),true);
			System.out.println();
		}
		
		ProductDetails p2=new ProductDetails(driver);
		int x=p2.get2ndProduct().getLocation().getX();
		int y=p2.get2ndProduct().getLocation().getY();
		u.scrollTo(driver, x, y);
		
		Thread.sleep(2000);
		
		p2.get2ndProduct().click();
		Thread.sleep(1000);
		ArrayList<String> child= new ArrayList(u.childParentBrowserPopup(driver));
		driver.switchTo().window(child.get(1));
		Thread.sleep(3000);
		
		ShareProduct s1=new ShareProduct(driver);
		s1.getShareBtn().click();
		Thread.sleep(1000);
		s1.getFacebook().click();
		Thread.sleep(2000);
		
		ArrayList<String> child1= new ArrayList(u.childParentBrowserPopup(driver));
		System.out.println(child1.size());
		driver.switchTo().window(child1.get(2));
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		s1.getFacebookEmail().sendKeys(p.getPropertiesFileData("facebookemail"));
		s1.getFacebookPass().sendKeys(p.getPropertiesFileData("facebookpassword"));
		s1.facebooklogin().click();
		
		Thread.sleep(6000);
		
		s1.postToFacebook().click();
		
		Thread.sleep(2000);
		driver.switchTo().window(child1.get(1));
		driver.navigate().refresh();
		Thread.sleep(3000);
		AddToCart a1=new AddToCart(driver);
		a1.addToCart().click();
		
		Thread.sleep(5000);
		
	}
	
}
























