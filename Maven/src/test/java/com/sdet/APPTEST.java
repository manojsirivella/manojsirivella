package com.sdet;


import org.testng.Assert;
import org.testng.annotations.Test;

public class APPTEST {
	
	@Test
	//Runn | Debug
	public void testlogin1()
	{
		App myapp =new App();
		Assert.assertEquals(0,myapp.userLogin("abc","abc@143"));
	}
	
	public void testlogin2() 
	{
		App myapp =new App();
		Assert.assertEquals(1,myapp.userLogin("abc","abc@123"));
		
	}

}
