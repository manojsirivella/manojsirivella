package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_page_url_At_Webpage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		if(driver.getCurrentUrl().contains("https://"))
		{
			System.out.println("url is matched");
			
			driver.findElement(By.xpath("//span[contains(.,'Downloads')]")).click();
			if(driver.getCurrentUrl().contains("downloads"))
				System.out.println("downloads url is matched");
			else
				System.out.println("downloads ulr is not matched");
		}
		else
			System.out.println("url is not matched");
		
		driver.close();
		
		
		
		
	

	}

}
