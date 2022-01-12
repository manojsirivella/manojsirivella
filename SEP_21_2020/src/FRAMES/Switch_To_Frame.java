package FRAMES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Frame {

	public static void main(String[] args) throws Exception {
		
		/*Steps to automate:-->
	  		1.Open cleartrip website
	  		2.Navigate Manage trips webpage
	  		3.Enter email 
	  		4.Enter TripId
	  		5.Click button */
	  System.setProperty("webdriver.chrome.driver","E:\\eclip\\open_reddiffmail\\Drivers_browser\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.cleartrip.com/flights");
	  driver.manage().window().maximize();
	  
	  WebElement ManageTrip=driver.findElement(By.xpath("//div[text()='Manage trips']"));
	  ManageTrip.click();
	  Thread.sleep(3000);
	  
	  driver.switchTo().frame("modal_window");
	  
	  WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	  email.sendKeys("manojsirivella1995@gmail.com");
	  
	  WebElement passwd =driver.findElement(By.xpath("//input[@id='tripidSecond']"));
	  passwd.sendKeys("7416267895");
	  
	  driver.switchTo().defaultContent();
	  
	  WebElement feedback=driver.findElement(By.xpath("//a[contains(.,'Feedback')]"));
	  feedback.click();
	  Thread.sleep(3000);
	  
	  driver.switchTo().frame("modal_window");
	  
	  WebElement backtohome=driver.findElement(By.xpath("//button[contains(.,'Back to home')]"));
	  backtohome.click();
	  
	  
	  
	  

	}

}
