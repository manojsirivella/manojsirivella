package ui_validation_Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RuntimeElement_ISDisplayed {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.cleartrip.com/";
		//driver.get("https://www.cleartrip.com/");
		//driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.manage().deleteCookieNamed(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement moreoptions=driver.findElement(By.xpath("//a[text( )='Class of travel, Airline preference']"));
		
	    
	    moreoptions.click();
	    
	    WebElement classoftravel=driver.findElement(By.xpath("//h4[text( )='Class of travel']"));
	    WebElement preferedairlines=driver.findElement(By.xpath("//h4[text( )='Preferred Airline']"));
	    
	    
	    if(classoftravel.isDisplayed()&&preferedairlines.isEnabled())
	    	System.out.println("test pass both options are visible after click of more options"+true);
	    else
	    	System.out.println("test fail both options are not visible after click more options"+false);
	    
	   WebElement m=driver.findElement(By.xpath("//a[text( )='Class of travel, Airline preference']"));
	   
	    m.click();
	    
	    
	    WebElement x=driver.findElement(By.xpath("//h4[text( )='Class of travel']"));
	    WebElement y=driver.findElement(By.xpath("//h4[text( )='Preferred Airline']"));
	    if(!x.isDisplayed()&&!y.isEnabled())
	    	System.out.println("test pass both options are not visible second click of more options"+true);
	    else
	    	System.out.println("test fail both options are visible second click of more options"+false);
	    	driver.close();
		
		

	}

}
