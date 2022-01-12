package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_Title_At_Webpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		String actual_title=driver.getTitle();
		
		String excepted_title="Selenium";
		
		boolean flag=actual_title.equals(excepted_title);
		
		if(flag=true) // if i put true, flag not equals also it will pass the argument to the if condition
		{
			System.out.println("title is match");
			
		 WebElement 	downloads=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
		 downloads.click();
		 String  downloads_title =driver.getTitle();
		 
		 String Atual_title="Downloads | Selenium";
		 if(downloads_title.equals(Atual_title))
		 
			 System.out.println("downloads title is match");
		 else
			 System.out.println("downloads title is not match");
		 
			
			
			
		}
		else
			System.out.println("flag is not match");
		

	}

}
