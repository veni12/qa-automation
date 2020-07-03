package com.Fbtestcases;


import org.openqa.selenium.support.PageFactory;

import com.Fbwebebreusuability.Fbselectlist;
import com.Fbwebobjects.Fbcommonobjects;

public class Fbaccounttestcase extends Fbselectlist {
	
	public static void fbaccountcreation () {
		
		
		Fbcommonobjects poj= PageFactory.initElements(driver, Fbcommonobjects.class);
		poj.createaccount.click();
		poj.Firstname.sendKeys("kuruba");
		poj.Sirname.sendKeys("chandra");
		poj.Mobileno.sendKeys("123456789");
		poj.Newpassword.sendKeys("Change4me");
	   fbdropdown();
	   poj.Male.click();
	   poj.Signup.click();
	   
	
		
	
		
	}

}
