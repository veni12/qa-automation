package com.Fbwebobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fbcommonobjects

{
	
		@FindBy(xpath="//a [@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']") public WebElement createaccount;
		@FindBy(xpath="//input[@id='u_0_n']") public WebElement Firstname;	
		@FindBy(xpath="//input[@id='u_0_p']") public WebElement Sirname;
		@FindBy(xpath="//input[@id='u_0_s']") public WebElement Mobileno;
		@FindBy(xpath="//input[@id='password_step_input']") public WebElement Newpassword;
		@FindBy(xpath="//select[@id=\"day\" ]") public WebElement day;
		@FindBy(xpath="//select[@class='_9407 _5dba _8esg']")public WebElement month;
		@FindBy(xpath="//select[@id=\"year\" ]")public WebElement year;		
		@FindBy(xpath="//input[@id='u_0_7']") public WebElement Male;
		@FindBy(xpath="//button[@id='u_0_14']") public WebElement Signup;
			

}
