package switchcommands.windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_Iterator {
	
	/*1. Launch chromebrowser and visit site "http://facebook.com"
	 * 2. Click Instagram hyper link[It opens in new window] 
	 * 3. In Instagram window enter login details
	 * 
	 * Note:--> This program is usefull when two windows are opened*/

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String title1 =driver.getTitle();
		driver.manage().window().maximize();
		
		WebElement insta=driver.findElement(By.xpath("//a[contains(.,'Instagram')]"));
		
		insta.click();
	   String	title2=driver.getTitle();
		
		
	Set<String>	AllWindows=driver.getWindowHandles();
	
	System.out.println("all windows id is"+AllWindows);
	
    Iterator<String> eachwindow=AllWindows.iterator(); 
    String window1 =eachwindow.next();
    String window2=eachwindow.next();
   
    driver.switchTo().window(window2);
    System.out.println("window2 title is "+driver.getTitle());
    driver.switchTo().window(window1);
    System.out.println("window1 title is"+driver.getTitle());
//   String title1 =driver.getTitle();
   
  /* if(window1.contains("Facebook – log in or sign up"))
   System.out.println("testpass fb title match");
   else
	   System.out.println("fb title not match");
	   
	if(window2.contains("Instagram"))	
		System.out.println("testpass insta title is match");
	else
		System.out.println("insta title is not match");*/
		
		
		
		

	}

}
