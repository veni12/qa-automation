package com.Fbwebebreusuability;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Fbutility.Fbbaseclass;

public class Fbselectlist extends Fbbaseclass {
	
	
	public static void fbdropdown(WebElement sel, String num) {
		
		Select s1= new Select(sel);
		s1.selectByValue(num);
		
	}

}
