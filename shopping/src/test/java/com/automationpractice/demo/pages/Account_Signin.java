
package com.automationpractice.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationpractice.demo.Base;


public class Account_Signin extends Base{

	public WebDriver driver;
	public Account_Signin(WebDriver driver) {
		this.driver = driver;
		
	}
	 
	 public By signin = By.xpath("//*[contains(text(),'Sign in')]");
	 public WebElement Signin() {
		  return driver.findElement(signin);
	 }
	 public By signmail1 = By.id("email");
	 public WebElement Enteremail() {
		  return driver.findElement(signmail1);
	 }
	 public By passw1 = By.id("passwd");
	 public WebElement Passw1() {
		  return driver.findElement(passw1);
	 }
	 public By loginbt = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	 public WebElement Loginbt() {
		  return driver.findElement(loginbt);
	 }
	 public By srch = By.xpath("//*[@id=\"search_query_top\"]");
	 public WebElement Search1() {
		  return driver.findElement(srch);
	 }
	 public By clksrch = By.xpath("//*[@id=\"searchbox\"]/button");
	 public WebElement Searchclk() {
		  return driver.findElement(clksrch);
	 }
	 public By product1 = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img");
	 public WebElement Product1() {
		  return driver.findElement(product1);
	 }
	 public By producttitle = By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1");
	 public WebElement Productt() {
		  return driver.findElement(producttitle);
	 }
	 public By add2cart = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
	 public WebElement Addcart() {
		  return driver.findElement(add2cart);
	 }
}