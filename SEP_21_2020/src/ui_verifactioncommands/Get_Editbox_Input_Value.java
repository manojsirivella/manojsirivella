package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Editbox_Input_Value {

	public static void main(String[] args) throws Exception 
	{
		/*Scenario:--> Verify Mobile operator loaded w.r.t mobile number
		  			Given site url is  "http://paytm.com"
		 			When User enter valid mobile number
		  			Then System fetch default operator w.r.t to mobile number
		  			And System fetch default location w.r.t to mobile number*/
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		
		driver.manage().window().maximize();
		
		WebElement mobilenum=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		WebElement operator=driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]"));
		//WebElement circle=driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		
		mobilenum.sendKeys("7416267895"+Keys.ENTER);
		
		Thread.sleep(2000);
		
	//	WebElement operator=driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]"));
		
	   String	atrbt1_operator=operator.getAttribute("value");
	   System.out.println(atrbt1_operator);
	   if(atrbt1_operator.equals("Vi"))
		   System.out.println("operator match");
	   else
		   System.out.println("operator not match");
	   Thread.sleep(2000);
	   WebElement circle=driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	  String atrbt_circle=circle.getAttribute("value");
	  System.out.println(atrbt_circle);
	   
	   
		

	}

}
