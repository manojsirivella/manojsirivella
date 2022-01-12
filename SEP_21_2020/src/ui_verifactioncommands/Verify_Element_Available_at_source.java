package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Available_at_source {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		String url="https://en-gb.facebook.com/";
		
		String title="Facebook – log in or sign up";
		
		String email="email";
		
		if(driver.getPageSource().contains("email"))
		{
			System.out.println("elament present at page source");
			
		WebElement	Email =driver.findElement(By.id("email"));
		Email.clear();
		Email.sendKeys("7416267895"+Keys.ENTER);
		
		}
		else
			System.out.println("element not presented at page source");
		
		
		
		

	}

}
