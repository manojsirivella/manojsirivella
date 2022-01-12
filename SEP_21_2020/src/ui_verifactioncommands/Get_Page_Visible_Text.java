package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Page_Visible_Text {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		WebElement signin_button=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		
		//WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		
		//WebElement error_text=driver.findElement(By.xpath("//div[@role='alert']"));
		
	//	WebElement Next_button =driver.findElement(By.xpath("//input[@type='submit']"));
		
	//	WebElement rootelement_text=driver.findElement(By.tagName("html"));
		
		signin_button.click();
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		
		email.clear();
		email.sendKeys("@$manaajj@gmail.com");
		WebElement Next_button =driver.findElement(By.xpath("//input[@type='submit']"));
		Next_button.click();
		
		WebElement error_text=driver.findElement(By.xpath("//div[@role='alert']"));
		
	   String	error =error_text.getText();
	   System.out.println("error text is "+error);
	   
	   String actual_error ="Enter a valid email address, phone number, or Skype name.";
	   
	   WebElement rootelement_text=driver.findElement(By.tagName("html"));
	   
	  String  root_text=rootelement_text.getText();
	  
	  if(root_text.contains(actual_error))
		  System.out.println("pass");
	  else
		  System.out.println("fail");
	   
	   
		

	}

}
