package UI_validations_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moreoptions {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.cleartrip.com/flights?msclkid=ea19cb5a134314fc4e10aa2dc7741cda");
		 driver.manage().window().maximize();
         WebElement moreoptions=driver.findElement(By.xpath("//a[text( )='Class of travel, Airline preference']"));
		
	    
	    moreoptions.click();
	    
	    WebElement classoftravel=driver.findElement(By.xpath("//h4[text()='Class of travel']"));
	    WebElement preferedairlines=driver.findElement(By.xpath("//h4[text( )='Preferred Airline']"));
	    WebElement classoftravel2=driver.findElement(By.xpath("//h4[text()='Class of travel']"));
	    
	    
	    if(classoftravel.isDisplayed()&&preferedairlines.isEnabled())
	    {
	    	System.out.println("test pass both options are visible after click of more options"+true);
	    	
	    	moreoptions.click();
	    	//WebElement classoftravel2=driver.findElement(By.xpath("//h4[text()='Class of travel']"));
		  //  WebElement preferedairlines3=driver.findElement(By.xpath("//h4[text( )='Preferred Airline']"));
	    	if(!classoftravel2.isDisplayed()&&!preferedairlines.isEnabled())
	    		System.out.println("testpass");
	    	else
	    		System.out.println("testfail");
	    	
	    	
	    }
	    else
	    	System.out.println("testfail");
	           
	    WebElement x=driver.findElement(By.xpath("//a[text( )='Class of travel, Airline preference']"));
	    x.click();
	    WebElement classoftravel1=driver.findElement(By.xpath("//h4[text()='Class of travel']"));
	    WebElement preferedairlines2=driver.findElement(By.xpath("//h4[text( )='Preferred Airline']"));
	    
	    if(!classoftravel1.isDisplayed())
	    {
	    	System.out.println("testpass");
	    }
	    	 
	    	/*	WebElement classoftrave_l=driver.findElement(By.xpath("//h4[text()='Class of travel']"));
	    	   WebElement preferedairlines_2=driver.findElement(By.xpath("//h4[text( )='Preferred Airline']"));*/
	    	  //  moreoptions.click();
	    	    
	    	    
	    		/*if(!classoftravel.isDisplayed()&&!preferedairlines.isEnabled())
	    		{
	    			System.out.println("objects are hidden"+true);
	    		}
	    		else
	    		{
	    			System.out.println("objects are not hidden"+false);
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("both elements are no displayed"+false);
	    		
	    	}
	    }
	    else
	    	System.out.println("test fail both options are not visible after click more options"+false);
	    Thread.sleep(3000);*/
	    //driver.navigate().refresh();
	    
	 //  WebElement m=driver.findElement(By.xpath("//a[text( )='Class of travel, Airline preference']"));
	  // WebElement x=driver.findElement(By.xpath("//h4[text( )='Class of travel']"));
	   // WebElement y=driver.findElement(By.xpath("//h4[text( )='Preferred Airline']"));
	   
	   /*
	    m.click();
	    
	    
	    
	    
	  WebElement x=driver.findElement(By.xpath("//h4[text( )='Class of travel']"));
	    WebElement y=driver.findElement(By.xpath("//h4[text( )='Preferred Airline']"));
	    if(!x.isDisplayed()&&!y.isEnabled())
	    	System.out.println("test pass both options are not visible second click of more options"+true);
	    else
	    	System.out.println("test fail both options are visible second click of more options"+false);
	    	driver.close();*/
	    driver.close();
      
	}
	    }
	

	    
	
