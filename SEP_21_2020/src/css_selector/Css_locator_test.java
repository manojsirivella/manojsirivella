package css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_locator_test 
{

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "Drivers_browser\\chromedriver.exe");
	  WebDriver wd= new ChromeDriver();
	  wd.manage().window().maximize();
	  
	  wd.get("https://www.facebook.com/r.php");
	  
	  wd.findElement(By.cssSelector("#u_0_j_SB")).sendKeys("manoj");
	  wd.findElement(By.cssSelector("*[aria-describedby='js_1']")).sendKeys("kumar");
	  wd.findElement(By.cssSelector("input[type='text'][aria-label='Mobile number or email address']"));
	 // wd.findElement(By.cssSelector(""))//

	}

}
