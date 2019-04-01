
package com.automationpractice.demo.regression3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import com.automationpractice.demo.*;

import com.automationpractice.demo.business.User_Signin;


public class User_AddtoCart {
	
	@Test
	public void test1() {
         Base b = new Base();
         WebDriver driver = b.getDriver();
        User_Signin Signinto = PageFactory.initElements(driver, User_Signin.class);
         String url = "http://automationpractice.com/index.php";
         driver.get(url); 
         driver.manage().window().maximize();
         Signinto.Login("starwar@abc.com","123456","dress");
         String text =  driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1")).getText();
         driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
         String Displayedtext = driver.findElement(By.xpath("//*[@id=\"layer_cart_product_title\"]")).getText();
         try{
        	 Assert.assertEquals(text,Displayedtext);
        	 System.out.println("Successfully added");
         }catch(AssertionError e)
         {
        	 System.out.println("Fail");
         }
         
         driver.close();
	}
}