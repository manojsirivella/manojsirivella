package ui_verifactioncommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Expected_option_Available_At_dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
      Select	month=new Select(driver.findElement(By.id("month")));
     List<WebElement> v=month.getOptions();
     
     for(int i=0;)
		
	   
	

	}

}
