
package com.automationpractice.demo.regression;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import com.automationpractice.demo.*;
import com.automationpractice.demo.business.Myaccount_nuser;

public class ValidateUser_FirstName {
	
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
         Createuser.formfillup("trial"+ randomInt +"@abc.com","","Jerry","trial"+ randomInt +"@abc.com","hello","12","9","2000","Tom","Jerry","abb","London Road","Derby","20","23445","21","12341234","google");
         WebDriverWait wait = new WebDriverWait( driver , 30);
         wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"center_column\"]/div")));
         
         WebElement ErrMsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li"));
    	 String Msg = ErrMsg.getText();
    	 String expectedText = "firstname is required.";
    	 Assert.assertEquals(Msg,expectedText);
        driver.close();
}
}