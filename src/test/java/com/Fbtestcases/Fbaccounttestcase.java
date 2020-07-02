package com.Fbtestcases;


import org.openqa.selenium.support.PageFactory;

import com.Fbwebebreusuability.Fbselectlist;
import com.Fbwebobjects.Fbcommonobjects;

public class Fbaccounttestcase extends Fbselectlist {
	
	public static void fbaccountcreation () {
		
		//Testcaseobjects poj=PageFactory.initElements(driver, Testcaseobjects.class);
		
		Fbcommonobjects poj= PageFactory.initElements(driver, Fbcommonobjects.class);
		poj.Firstname.sendKeys("kuruba");
		poj.Sirname.sendKeys("chandra");
	
		
		
		
	
		
	}

}
