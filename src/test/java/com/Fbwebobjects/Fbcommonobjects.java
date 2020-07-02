package com.Fbwebobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fbcommonobjects

{
	
		
		@FindBy(xpath="//input[@id='u_0_o']") public WebElement Firstname;	
		@FindBy(xpath="//input[@id='u_0_q']") public WebElement Sirname;
		@FindBy(xpath="//input[@id='u_0_t']") public WebElement Mobileno;
		@FindBy(xpath="//input[@id='u_0_y']") public WebElement Newpassword;
		@FindBy(xpath="//input[@id='u_0_7']") public WebElement Male;
		@FindBy(xpath="//input[@id='u_0_15']") public WebElement Signup;
			

}
