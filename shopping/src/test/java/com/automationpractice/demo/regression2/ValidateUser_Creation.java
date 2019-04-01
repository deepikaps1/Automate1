
package com.automationpractice.demo.regression2;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import com.automationpractice.demo.*;
import com.automationpractice.demo.business.Myaccount_nuser;

public class ValidateUser_Creation {
	
	@Test
	public void test1() {
         Base b = new Base();
         WebDriver driver = b.getDriver();
        Myaccount_nuser Createuser = PageFactory.initElements(driver, Myaccount_nuser.class);
         String url = "http://automationpractice.com/index.php";
         driver.get(url); 
         driver.manage().window().maximize();
	
         Random randomGenerator = new Random();  
         int randomInt = randomGenerator.nextInt(1000);        
         Createuser.formfillup("trial"+ randomInt +"@abc.com","Tom","Jerry","trial"+ randomInt +"@abc.com","hello","12","9","2000","Tom","Jerry","abb","London Road","Derby","20","23445","21","12341234","google");
         WebElement UserName = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));
    	 String Msg = UserName.getText();
    	 String expectedText = "Tom Jerry";
    	 Assert.assertEquals(Msg,expectedText);
         
         
	driver.close();
	}

}