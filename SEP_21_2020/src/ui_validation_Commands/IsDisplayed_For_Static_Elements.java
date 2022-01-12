package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_For_Static_Elements {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.outlook.com");
		driver.manage().window().maximize();
		
		WebElement signin=driver.findElement(By.xpath("//a[text( )='Sign in']"));
		if(signin.isDisplayed()&&signin.isEnabled())
			
		signin.click();
		
		else
			System.out.println("sighin button is not disable and enable"+"\t"+ false);
		
		Thread.sleep(3000);
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		if(email.isDisplayed()&&email.isEnabled())
		{
			email.clear();
		email.sendKeys("manojsirivella7416267895@gmail.com");
		}
		else
		{
			System.out.println("email is not visible and disabled at page"+"\t"+false);
		
		}
		WebElement Nextbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		
		if(Nextbutton.isDisplayed()&&Nextbutton.isEnabled())
		   Nextbutton.click();
		else
			System.out.println("next button is not disable and enable"+"\t"+false);
		
		Thread.sleep(3000);
		
		WebElement passwd=driver.findElement(By.xpath("//input[@name='passwd']"));
		
		if(passwd.isDisplayed()&&passwd.isEnabled())
		{
			passwd.clear();
		    passwd.sendKeys("july21@12.15"+Keys.ENTER);
		}
		    else
		    	System.out.println("passwd button is not disable or enable"+"\t"+false);
		driver.quit();
		
		

	}

}
