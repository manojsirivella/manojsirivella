package switchcommands.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling_Using_Try_Catch_ {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		d.manage().window().maximize();
		
		WebElement jsAlert=d.findElement(By.xpath("//button[text( ) ='Click for JS Alert']"));
		
		jsAlert.click();
		
		
		Alert	alert=d.switchTo().alert();
        String	alert_text =alert.getText();
        System.out.println(alert_text);
        
			
			
		/*catch (NoAlertPresentException e){
			System.out.println("alert not presented");*/
			
			
		}
		
		

	}


