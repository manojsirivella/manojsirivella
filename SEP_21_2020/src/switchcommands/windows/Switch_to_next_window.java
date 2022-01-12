package switchcommands.windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_next_window {
	/*1. Launch chromebrowser and visit site "http://facebook.com"
	 * 2. Click Instagram hyper link[It opens in new window] 
	 * 3. In Instagram window enter login details
	 * 
	 * Note:--> This program is usefull when two windows are opened
*/
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\eclip\\practise\\Project_1(basic)\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		/*WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.clear();
		email.sendKeys("7416267895" +Keys.ENTER);*/
		
		String wind1ID=driver.getWindowHandle();
		System.out.println("first window id is" +wind1ID);
		
		
		WebElement instagram=driver.findElement(By.xpath("//a[.='Instagram']"));
		instagram.click();
		Thread.sleep(3000);
		
		Set<String> window2ID =driver.getWindowHandles();
		System.out.println("second window id before fore each is" +window2ID);
		
		for (String eachID : window2ID) 
		{
			driver.switchTo().window(eachID);
			
		   String	RuntimeTitle=driver.getTitle();
		   if (RuntimeTitle.equals("Facebook – log in or sign up")) 
		   {
			   break;
			
		   }
			
			
		}
		WebElement FBemail=driver.findElement(By.xpath("//input[@id='email']"));
		FBemail.clear();
		FBemail.sendKeys("hello fb");
	
	
		//System.out.println("current title must be insta after foreeach is "+driver.getTitle());
		//System.out.println("instagram Secongd  windowid foreeach  is"+driver.getWindowHandle());
		
	


		
		
		Thread.sleep(2000);
		for (String eachID : window2ID) 
		{
			driver.switchTo().window(eachID);
			
		   String	RuntimeTitle=driver.getTitle();
		   if (RuntimeTitle.equals("Instagram")) 
		   {
			   break;
			
		   }
			
			
		}
		
		
		WebElement instaemail=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		instaemail.clear();
		instaemail.sendKeys("hello insta"+Keys.ENTER);
		driver.quit();
		
	}

}

