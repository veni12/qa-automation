package com.Fbwebebreusuability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Fbutility.Fbbaseclass;

public class Fbselectlist extends Fbbaseclass {
	
	
	public static void fbdropdown() {
		
		WebElement Ele1 = driver.findElement(By.id("day"));
		Select sel = new Select(Ele1);
sel.selectByValue("23");

WebElement ele2 = driver.findElement(By.id("month"));
Select sel2=new Select(ele2);
sel2.selectByValue("2");

WebElement ele3=driver.findElement(By.id("year"));
Select sel3=new Select(ele3);
sel3.selectByValue("2001");
		
		
	}

}
