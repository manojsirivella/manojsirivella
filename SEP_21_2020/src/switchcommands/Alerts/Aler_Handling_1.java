package switchcommands.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aler_Handling_1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		
		WebDriver d =new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		d.manage().window().maximize();
		
		WebElement jsAlert=d.findElement(By.xpath("//button[.='Click for JS Confirm']"));
		WebElement jsConfirm=d.findElement(By.xpath("//button[.='Click for JS Confirm']"));
		WebElement jsPrompt=d.findElement(By.xpath("//button[.='Click for JS Prompt']"));
				
		jsAlert.click();
		
	    Alert	alert=d.switchTo().alert();
	    String alert_text=alert.getText();
	    alert.accept();
	    System.out.println("js alert text is"+alert_text);
	    
	    Thread.sleep(2000);
	    
	    jsConfirm.click();
	    
	   Alert alert1=d.switchTo().alert();
	   String alert1Text =alert1.getText();
	   System.out.println("js confirm alert is"+alert1Text);
	   
	   alert1.accept();
	   
	   Thread.sleep(2000);
	   
	   jsPrompt.click();
	   
	   Alert alert2=d.switchTo().alert();
	  String alert2Text =alert2.getText();
	  System.out.println("alert2 text is "+alert2Text);
	   alert2.sendKeys("7416267895");
	   Thread.sleep(5000);
	  /* String jsPromptText=alert2.getText();
	   System.out.println("jspromt text is "+jsPromptText);
	   */
	 //  alert2.sendKeys("7416267895");
	   
	   alert2.accept();
	   
	    
	    
	    
	    
		
		

	}

}
