
package com.automationpractice.demo.business;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.automationpractice.demo.pages.Account_Signin;

public class User_Signin extends Account_Signin{
	
	public User_Signin(WebDriver driver) {
		super(driver);
	}
   
public void Login(String signmailid, String password,String searchprod ) {
    
	Signin().click();
	Enteremail().clear();
	Enteremail().sendKeys(signmailid);
	Passw1().clear();
	Passw1().sendKeys(password);
	Loginbt().click();
	Search1().sendKeys(searchprod);
	Searchclk().click();
	Product1().click();
	
    	
    }
}
