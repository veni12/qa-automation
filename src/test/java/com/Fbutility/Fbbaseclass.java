package com.Fbutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbbaseclass {
	
public static WebDriver driver;
	

	public static void fbbrowserlaunch (String browser)
	{
		try {
			if (browser.equals("Chrome"))
			{
			String chromepath = System.getProperty("user.dir")+"/Fbbrowsers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver =new ChromeDriver();
			String url= fblogindataexcel("fblogindetails",1,0);
			driver.get(url);
			System.out.println("browserLanched");
			String username=fblogindataexcel("fblogindetails",1,1);
	   /*driver.findElement(By.id("email")).sendKeys(username);
	   String password=fblogindataexcel("fblogindetails",1,2);
	   driver.findElement(By.id("pass")).sendKeys(password);
	   */
	   Thread.sleep(2000);
	   driver.findElement(By.id("u_0_b")).click();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Browser has not launched");
		}
		
	}
	

	public static String fblogindataexcel(String sheetname,int rownum,int column) throws IOException {
		
		String filelocation=System.getProperty("user.dir")+"/Testdata_fb/New Microsoft Excel Worksheet.xlsx";


			

		FileInputStream fis= new FileInputStream(filelocation);

		@SuppressWarnings("resource")
		XSSFWorkbook xsw = new XSSFWorkbook(fis);
		XSSFSheet xss= xsw.getSheet(sheetname);
		String cellvalue=xss.getRow(rownum).getCell(column).getStringCellValue();
		return cellvalue;

		

		}
		
	
}



