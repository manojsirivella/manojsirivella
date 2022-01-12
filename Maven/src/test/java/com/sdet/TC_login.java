package com.sdet;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_login {
	@Test
	
	public void login_test() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.xpath("(//span[@class='form-hint'])[1]")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[contains(@id,'txtPassword')]")).sendKeys("admin123");
		//driver.findElement(By.xpath("@FindBy(xpath = \"//input[contains(@type,'submit')]\")")).click();*/
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		driver.close();
	}   
	

}
