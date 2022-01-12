package ui_validation_Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_Selection_State {

	public static void main(String[] args) throws Exception {
		
		 /*Scenario: Verify keep me signin checkon unchecked before password entry
		  			Given site url is https://www.facebook.com/
		 			And click on Singin button
		  			when enter valid email and click next button
		  			Then Verify Keep me sign in checkbox should be unchecked..*/
		 
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement female_checkbox=driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		
		if(!female_checkbox.isSelected())
			System.out.println("test pass female radio button is not selected"+"\t"+true);
		else
			System.out.println("test fail female radio button is selected "+"\t"+false);
		
		female_checkbox.click();
		Thread.sleep(2000);
		
		if(female_checkbox.isSelected())
			System.out.println("testpass female radio button is selected"+"\t"+true);
		else
			System.out.println("testfail female radio button is not selected"+"\t"+false);
		
		
		
		

	}

}
