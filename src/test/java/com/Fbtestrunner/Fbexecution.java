package com.Fbtestrunner;

import org.testng.annotations.Test;

import com.Fbtestcases.Fbaccounttestcase;

public class Fbexecution extends Fbaccounttestcase {
	
	@Test
	
	public static void fbrunner()
	{
		fbbrowserlaunch("Chrome");
		fbaccountcreation ();
	}

}
