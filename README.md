# Automate1

This is a Selenium Webdriver POM based automation Test set for Shopping in the Website http://automationpractice.com
c
The Project is built to creating verification and vaidation of the Sign in Page and Adding a Product to Cart.

The Automation setup is built using Java Selenium Webdriver with Maven and TestNG

Pre-requites in System
-----------------------

Java
Eclipse Neon
Latest Version of Selenium Webdriver
Maven
TestNG

Project Structure
------------------
The Shopping Project consists of 3 Packages of Business, Pages and Regression Test cases

The Business Class consist of the functional flow on each page using which the Test cases can be executed.

Myaccount_nuser.java
User_Signin.java

The Page class have the Locators parametrised on each page

Account_Signin.java
Myaccount_create.java

The 3 Packages below have the test cases for the individual flow

com.automationpractice.demo.regression
com.automationpractice.demo.regression2
com.automationpractice.demo.regression3

The java class inside these regression packages need to be run as TestNG test.
The Test output can be checked in the Test-output folder of the project created in the machine

Author - Deepika
