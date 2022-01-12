package switchcommands.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Alert_Presented_With_Try_Catch {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		
		/*WebElement display_an_alert_box =d.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
		display_an_alert_box.click();
		Thread.sleep(3000);*/
		
		
		try {
			WebElement display_an_alert_box =d.findElement(By.xpath("//button[contains(@clas,'btn btn-danger')]"));
			display_an_alert_box.click();
			Thread.sleep(3000);
			Alert alert1=d.switchTo().alert();
		    String	alert1Text =alert1.getText();
		    
		    System.out.println("alert1 Text is "+alert1Text);
		    alert1.accept();
		}catch(Exception e){
		
                       e.printStackTrace();
	}

		System.out.println("Run continued");
		
		WebElement display_an_alert_box =d.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
		display_an_alert_box.click();
		Thread.sleep(3000);
		Alert alert1=d.switchTo().alert();
	    String	alert1Text =alert1.getText();
	    
	    System.out.println("alert1 Text is "+alert1Text);
	    alert1.accept();
	}
}
