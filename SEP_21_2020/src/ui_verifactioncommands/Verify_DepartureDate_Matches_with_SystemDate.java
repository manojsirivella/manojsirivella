package ui_verifactioncommands;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_DepartureDate_Matches_with_SystemDate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://book.spicejet.com/search.aspx");
		
		driver.manage().window().maximize();
		
	//	WebElement selected_date=driver.findElement(By.xpath("//*[@id=\"date_picker_id_1\"]"));
		
		WebElement depature_date=driver.findElement(By.xpath("//*[@id=\"date_picker_id_1\"]"));
		WebElement readonly=driver.findElement(By.xpath("//*[@id='custom_date_picker_id_1']"));
	    String	flag=readonly.getAttribute("readonly");
	    if(flag.equals("true"))
	    	System.out.println("readonly attribute is true");
	    else
	    	System.out.println("readonly attribute is not true,false");
		
	    String	depature_date1=depature_date.getAttribute("value");
	    System.out.println(depature_date1);
	    
	    Date d =new Date();
	    
	    System.out.println(d.toString()); //Mon Oct 25 23:58:59 IST 2021
	    
	    SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-YYY");
	    
	   String sysdate =sdf.format(d);
	   
	   System.out.println(sysdate);
	   
	   if(depature_date1.equals(sysdate))
		   System.out.println("system and depature date is match"+true);
	   else
		   System.out.println("false");

	   /*dd=0-31;
	   MM=0-12;
	   YY=19;
	   YYY=2021;
	   EEE=sat-sun*/
	}

}
