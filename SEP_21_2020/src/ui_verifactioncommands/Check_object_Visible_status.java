package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_object_Visible_status {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		driver.manage().window().maximize();
		
		WebElement wd0=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		if(!wd0.isDisplayed())
         System.out.println("initially Re enter email at hidden state true");
		else
			System.out.println("initially Re enter email is not hodden state");
		
		WebElement wd1=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		wd1.sendKeys("manojsirivella1995@gmail.com");
		
	 WebElement	wd2=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	 if(wd2.isDisplayed())
		 System.out.println("after Re enter email is not hiddenstate true");
	 else
		 System.out.println("after Re enter email is hidden state flase");
	 
	 driver.close();
		
		
		
		
		
		
		

	}

}
