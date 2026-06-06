package fistproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
// تطبيق اول 5 محاضرات اوتوماشين 
public class MyTestCases {
	String Website = "https://www.saucedemo.com/";// الموقع الي بدي اعمله تيست
	WebDriver driver = new EdgeDriver(); // OPEN WITH EDGDRIVER
		
		@BeforeTest 
		public void BF () {
			driver.get(Website);// افتح الموقع 
			driver.manage().window().maximize();// كبر الصفحة 
		}
		// login 
		@Test(priority = 0)
		public void Login  () {
			WebElement Username = driver.findElement(By.id("user-name"));
			Username.sendKeys("standard_user");
			WebElement Password = driver.findElement(By.id("password"));
			Password.sendKeys("secret_sauce");
			WebElement LoginButton = driver.findElement(By.id("login-button"));
			LoginButton.click();
			
			
		}
		// add and remove 
		@Test(priority = 1,enabled =  false)
		public void ADDARE () {
			WebElement ADDTOCART1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
			ADDTOCART1.click();
			WebElement Remove1 = driver.findElement(By.id("remove-sauce-labs-backpack"));
			Remove1.click();
			
			
		//aaaaaa	
		}
		// اضافة العناصر دفعة وحدة باستخدام الفوووور 
		@Test(priority = 1,enabled =  false) 
		public void ADDALL() {
			List<WebElement> ADDALLITEM = driver.findElements(By.className("btn_primary"));	
			
			for (int i =0; i<ADDALLITEM.size();i++) {
				ADDALLITEM.get(i).click();
			}
		}
		@Test(priority = 2,enabled =  false)
		public void RemoveALL () {
			List<WebElement> REMOVEALLITEM = driver.findElements(By.className("btn_secondary"));
		
		for (int i =0 ; i< REMOVEALLITEM.size();i++) {
			REMOVEALLITEM.get(i).click();
			
		}
			
		}
		@Test(priority = 3,enabled =  false)
		public void MYTEST () {
			List<WebElement> ItemNames = driver.findElements(By.className("inventory_item_name"));
			List<WebElement> Prices = driver.findElements(By.className("inventory_item_price"));
			
			String FName =ItemNames.get(0).getText();
			String Fprice =Prices.get(0).getText();
			System.out.println(FName);
			
			System.out.println(Double.parseDouble(Fprice.replace("$",""))*10);
			
					
// CSS CELECTOR + XPATH 
		}
		@Test(priority = 4,enabled =  false)
		public void TEST4 () {
			WebElement AddTOCart = driver.findElement(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory"));
			AddTOCart.click();
			
			//tagname[attribute='value of attribute']......الطريقة الصحيحة لكتابته 
			
			
		}
			
				
				
			
			
		
		
		@AfterTest
		public void Aft () {
			
		}
}
