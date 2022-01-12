package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_Attribute1 {

	public static void main(String[] args) throws Exception {
	 System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.makemytrip.com/");
	 driver.manage().window().maximize();
	 
	 WebElement oneWay=driver.findElement(By.xpath("//li[.='OneWay']"));
	 WebElement roundway=driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[1]/ul/li[2]"));
     WebElement multicity=driver.findElement(By.xpath("//li[.='Multi City']"));
	 
    String atrbt_1way=oneWay.getAttribute("class");
    if(atrbt_1way.equals("selected"))
    	System.out.println("atrbt_1way is in selected mode true");
    else
    	System.out.println("atrbt_1way is not in selected mode false");
    
    
    roundway.click();
    String atrbt_roundway_a=roundway.getAttribute("class");
    System.out.println("roundway attribute after clicking roundway "+atrbt_roundway_a);
    String atbt_1way_a=oneWay.getAttribute("class");
    if(atbt_1way_a.isEmpty())
    {
    	System.out.println("oneway class is empty after select of roundway true");
    
     multicity.click();
     String  atrbt_multy=multicity.getAttribute("class");
    System.out.println("multycity attribute after click ,it is in selected mode"  +atrbt_multy);
     String atrbt_roundway_b=roundway.getAttribute("class");
     if(atrbt_roundway_b.isEmpty())
    	 System.out.println("roundway attribute after clicking of multycity is empty");
     else
    	 System.out.println("roundway attribute after clicking of multycity is empty");
    }
    else
    	System.out.println("oneway class  is not empty after select of roundway");
    
	
	}

}

