
package com.automationpractice.demo.business;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationpractice.demo.pages.Myaccount_create;

public class Myaccount_nuser extends Myaccount_create{
	
	public Myaccount_nuser(WebDriver driver) {
		super(driver);
	}
   
public void formfillup(String createacc,String firstname,String lastname,String mailid,String Passw,String dobday1,String dobmon1,String dobyear,String addf1name,String addl2name,String Company,String Adrs1,String City12,String State12,String Postcode,String Country,String Phonenum,String Reference) {
    
	Signin().click();
	Createaccmail().clear();
	Createaccmail().sendKeys(createacc);
	Submit().click();
	    
	 WebDriverWait wait = new WebDriverWait( driver , 30);
     wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[2]/label")));
        Firstnm().clear();
	    Firstnm().sendKeys(firstname);
	    Lastnm().clear();
	    Lastnm().sendKeys(lastname);
	    Eml().clear();
	    Eml().sendKeys(mailid);
	    Pswd().clear();
	    Pswd().sendKeys(Passw);
	    
	    Select DobDay = new Select(driver.findElement(dobday));
	    DobDay.selectByValue(dobday1);
	    Select DobMon = new Select(driver.findElement(dobmon));
	    DobMon.selectByValue(dobmon1);
	    Select DobYr = new Select(driver.findElement(dobyr));
	    DobYr.selectByValue(dobyear);
	    
	    Addfname().clear();
	    Addfname().sendKeys(addf1name);
	    Addlname().clear();
	    Addlname().sendKeys(addl2name);
	    Compan().clear();
	    Compan().sendKeys(Company);
	    Adres1().clear();
	    Adres1().sendKeys(Adrs1);
	    City1().clear();
	    City1().sendKeys(City12);
	    Select State = new Select(driver.findElement(stat));
	    State.selectByValue(State12);
	    Postc().sendKeys(Postcode);
	    Select Countr = new Select(driver.findElement(contr));
	    Countr.selectByValue(Country);
	    
	    Phnum().sendKeys(Phonenum);
	    Refer().sendKeys(Reference);
	 
	    Register().click();
    	
    }
}
