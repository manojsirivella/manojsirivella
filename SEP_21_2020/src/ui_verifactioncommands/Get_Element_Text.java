package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Text {

	public static void main(String[] args) throws Exception 
	{
		        /*Scenario: Verifying login with invalid email address
		 
		  		Given site url is http://outlook.com
		  		And click Signin button
		 		When Use enter invalid email address
		 		And click on Next button to validate email
		  		Then error message should be displayed*/

		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.outlook.com");
		driver.manage().window().maximize();
		
		WebElement singin_button=driver.findElement(By.xpath("(//a[.='Sign in'])[1]"));
		singin_button.click();
		
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.clear();
		
		email.sendKeys("@$manaajj@gmail.com");
		
		WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
		button.click();
		
		WebElement error_text=driver.findElement(By.xpath("//div[@id='usernameError']"));
		System.out.println(error_text.getText());
	String	actual_test =error_text.getText();
	String expected="Enter a valid email address, phone number, or Skype name.";
		
		if(error_text.getText().equals("Enter a valid email address, phone number, or Skype name."))
		System.out.println("erro  text is match");
		else
			System.out.println("error text is not match");
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
