package ui_verifactioncommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_verifications {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	   String	title=driver.getTitle();
	   
	   if(title.equals("(1) Facebook"));
	   System.out.println("runtime title vrified");
		
	  String url=driver.getCurrentUrl();
	  if(url.equals("https://www.facebook.com/"));
	  System.out.println("runtime url is verified");
	  
	 String pagesource=driver.getPageSource();
	  if(pagesource.contains("https://www.facebook.com/"));
	  System.out.println("pagesource is verified");
	  
	  
	  
		

	}

}
