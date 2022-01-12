package switchcommands.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		
		WebElement alertbox=d.findElement(By.xpath("//button[@class='btn btn-danger']"));
	WebElement alertwithok=d.findElement(By.xpath("//a[contains(.,'Alert with OK & Cancel')]"));
WebElement displatconfirmbox=d.findElement(By.xpath("//button[text( )='click the button to display a confirm box ']"));
/*WebElement Textbox=d.findElement(By.xpath("//a[.='Alert with Textbox ']"));
WebElement propmtbox=d.findElement(By.xpath("//button[text( )='click the button to demonstrate the prompt box ']"));*/
		alertbox.click();
		Alert alert1=d.switchTo().alert();
	   String	alert1Text =alert1.getText();
	   System.out.println("alert1 text is "+alert1Text);
	   alert1.accept();
	   
	   
	   
	   alertwithok.click();
	   
	   displatconfirmbox.click();
	   
	   Alert alert2=d.switchTo().alert();
	   String alert2Text =alert2.getText();
	   System.out.println("alert2 text is "+alert2Text);
	   alert2.accept();
	   Thread.sleep(2000);
	   WebElement Textbox=d.findElement(By.xpath("//a[.='Alert with Textbox ']"));
	   
	 //  WebElement propmtbox=d.findElement(By.xpath("//button[text( )='click the button to demonstrate the prompt box ']"));
	   Textbox.click();
	   Thread.sleep(3000);
	   WebElement propmtbox=d.findElement(By.xpath("//button[text( )='click the button to demonstrate the prompt box ']"));
	   propmtbox.click();
	   Thread.sleep(3000);
	   
	   
	   
	   
	   
	   
	   
	   Alert alert4=d.switchTo().alert();
	   alert4.sendKeys("7416267895");
	   Thread.sleep(3000);
	   String  alert4Text=alert4.getText();
	   System.out.println("alert 4 text is "+alert4);
	   
	   alert4.accept();
	   
	   
	   
	   
		
		
	}

}
