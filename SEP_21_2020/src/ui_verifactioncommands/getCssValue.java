package ui_verifactioncommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {

	public static void main(String[] args) throws Exception {
      System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://book.spicejet.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      
      
      WebElement login_button=driver.findElement(By.xpath("//input[@value='RoundTrip']"));
      
      login_button.click();
      
      Thread.sleep(3000);
      
      
      
      
      
     String csscolour= login_button.getCssValue("color");
     System.out.println(csscolour);
     
     if(csscolour.equals("rgba(255,0,0,1)"))
    	 System.out.println("colour match");
     
     else
    	 System.out.println("colour not match");

	}

}
