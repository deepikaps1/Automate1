package com.automationpractice.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationpractice.demo.Base;


public class Myaccount_create extends Base{

	public WebDriver driver;
	public Myaccount_create(WebDriver driver) {
		this.driver = driver;
		
	}
	 public By createacc = By.id("email_create");
	 public WebElement Createaccmail() {
		  return driver.findElement(createacc);
	 }
	 public By signin = By.xpath("//*[contains(text(),'Sign in')]");
	 public WebElement Signin() {
		  return driver.findElement(signin);
	 }
	 public By createbtn = By.id("SubmitCreate");
	 public WebElement Submit() {
		  return driver.findElement(createbtn);
	 }
	 public By firstnm = By.xpath("//*[@id=\"customer_firstname\"]");
	 public WebElement Firstnm() {
		  return driver.findElement(firstnm);
	 }
	 public By lastnm = By.xpath("//*[@id=\"customer_lastname\"]");
	 public WebElement Lastnm() {
		  return driver.findElement(lastnm);
	 }
	 public By eml = By.id("email");
	 public WebElement Eml() {
		  return driver.findElement(eml);
	 }
	 public By pwd = By.id("passwd");
	 public WebElement Pswd() {
		  return driver.findElement(pwd);
	 }
	
	 public By dobday = By.xpath("//*[@id='days']");
	 public WebElement DobDay() {
		  return driver.findElement(dobday);
	 }
	 public By dobmon = By.xpath("//*[@id='months']");
	 public WebElement DobMon() {
		  return driver.findElement(dobmon);
	 }
	 public By dobyr = By.xpath("//*[@id='years']");
	 public WebElement DobYr() {
		  return driver.findElement(dobyr);
	 }
	 public By addfname = By.id("firstname");
	 public WebElement Addfname() {
		  return driver.findElement(addfname);
	 }
	 public By addlname = By.id("lastname");
	 public WebElement Addlname() {
		  return driver.findElement(addlname);
	 }
	 public By comp = By.xpath("//*[@id='company']");
	 public WebElement Compan() {
		  return driver.findElement(comp);
	 }
	 public By adres1 = By.xpath("//*[@id='address1']");
	 public WebElement Adres1() {
		  return driver.findElement(adres1);
	 }	  
	 public By city1 = By.xpath("//*[@id='city']");
	 public WebElement City1() {
		  return driver.findElement(city1);
	 }	  
	 public By stat = By.xpath("//*[@id='id_state']");
	 public WebElement State() {
		  return driver.findElement(stat);
	 }
	 public By postc = By.xpath("//*[@id='postcode']");
	 public WebElement Postc() {
		  return driver.findElement(postc);
	 }
	 public By contr = By.xpath("//*[@id='id_country']");
	 public WebElement Countr() {
		  return driver.findElement(contr);
	 }
	 public By phno = By.xpath("//*[@id='phone_mobile']");
	 public WebElement Phnum() {
		  return driver.findElement(phno);
	 }
	 public By refer = By.xpath("//*[@id='alias']");
	 public WebElement Refer() {
		  return driver.findElement(refer);
	 }
	 public By regis = By.xpath("//*[@id=\"submitAccount\"]/span");
	 public WebElement Register() {
		  return driver.findElement(regis);
	 }
	 }

	 

