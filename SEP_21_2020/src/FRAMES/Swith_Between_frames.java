package FRAMES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Swith_Between_frames {

	public static void main(String[] args) throws Exception {
		
		  System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		 // driver.get("https://epass.apcfss.in/");
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("7416267895");
		  
		  
		  
		 // driver.switchTo().frame("menuFrame");
		  
		  
		  
		/*  
		  WebElement feesStructure=driver.findElement(By.xpath("//a[text()='Fee Structure']"));
		  feesStructure.click();
		  driver.switchTo().defaultContent();
		  Thread.sleep(3000);
		  
		  
		  driver.switchTo().frame("bodyFrame");
		  new Select(driver.findElement(By.xpath("//select[@name='ins_board']"))).selectByVisibleText("ANDHRA UNIVERSITY");
		  Thread.sleep(3000);
		  
		  new Select(driver.findElement(By.xpath("//select[@name='coll_course']"))).selectByIndex(2);;
		  Thread.sleep(2000);
		  
		  new Select(driver.findElement(By.xpath("//select[@name='course_year']"))).selectByIndex(2);
		  Thread.sleep(3000);
		  new Select(driver.findElement(By.xpath("//select[@name='ac_year']"))).selectByVisibleText("2012-13");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  
		  driver.switchTo().defaultContent();*/
		  
		  
		  
		
		 
		 
	}

}
