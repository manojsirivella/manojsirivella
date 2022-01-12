package switchcommands.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm_Alert_Handling_With_Cancel_button {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		
		WebElement alertwithok=d.findElement(By.xpath("//a[.='Alert with OK & Cancel ']"));
		alertwithok.click();
		Thread.sleep(3000);
		
		WebElement confirmbox=d.findElement(By.xpath("//button[.='click the button to display a confirm box '] "));
		
		confirmbox.click();
		Thread.sleep(2000);
		
		Alert alert1=d.switchTo().alert();
		String alert1Text =alert1.getText(); 
		System.out.println("alert1 text is "+alert1Text);
		
		alert1.dismiss();

	}

}
