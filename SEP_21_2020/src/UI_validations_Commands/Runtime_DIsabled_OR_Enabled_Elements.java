package UI_validations_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_DIsabled_OR_Enabled_Elements {

	public static void main(String[] args) throws Exception {
		/*Scenairo: Verify registration button disabled status
		  		Given site url http://practice.automationtesting.in/my-account/
		  		When user enter password less than required characters
		  		Then verify password button should be disable
		 		And not allowed perform user action.*/
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://practice.automationtesting.in/my-account/");
		d.manage().window().maximize();
		
		WebElement passwd=d.findElement(By.xpath("(//input[@type='password'])[2]"));
		
		passwd.sendKeys("july2"+Keys.ENTER);
		WebElement registerbutton=d.findElement(By.xpath("//input[@value='Register']"));
		
		if(!registerbutton.isEnabled())
		{
			System.out.println("testpass");
			passwd.clear();
			
			passwd.sendKeys("july21@12.15@#"+Keys.ENTER);
			Thread.sleep(2000);
			passwd.sendKeys("$");
			if(registerbutton.isEnabled())
				System.out.println("register button is enabled after enter strong passwd"+true);
			else
				System.out.println("register button is not enable after enter strong passwd"+false);
		}
		else
			System.out.println("testfail");
		

	}

}
