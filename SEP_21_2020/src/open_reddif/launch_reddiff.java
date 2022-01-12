package open_reddif;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.omg.CORBA.SystemException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.ui.Select;

public class launch_reddiff {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers_browser\\chromedriver.exe");
	    WebDriver wd=new ChromeDriver();
	    wd.manage().window().maximize();
	    
	    wd.get("http://register.rediff.com/register/register.php?FormName=user_details");
	    
	    System.out.println("Page title: "+ wd.getTitle());
	    wd.findElement(By.cssSelector("value='m'")).click();
		   
		   new Select(wd.findElement(By.cssSelector("#country"))).selectByVisibleText("India");
		   
		   new Select(wd.findElement(By.cssSelector("[name='cityc0965f7b']"))).selectByVisibleText("Bangalore");
		   
		   wd.findElement(By.cssSelector("input[maxlength='61'])).sendKeys("sreeram");
		    
		    wd.findElement(By.cssSelector("*[onfocus='javascript:checkFullName(document.forms[0].namec0965f7b.value);']")).sendKeys("sreeram.786");
		    
		    wd.findElement(By.cssSelector("value='Check availability'")).click();
		    Thread.sleep(4000);
		    
		    wd.findElement(By.cssSelector("name='passwdc0965f7b'")).sendKeys("Hello123@");
		    
		    wd.findElement(By.cssSelector("name='confirm_passwdc0965f7b'")).sendKeys("Hello123@");
		    
		    wd.findElement(By.cssSelector("name='altemailc0965f7b'")).sendKeys("sreeram.jai@gmail.com");
		    // div#div_altemail>table [cellspacing='0']>tbody>tr>td[width='185']>input[onblur='fieldTrack(this);']
		    wd.findElement(By.cssSelector("#mobno")).sendKeys("9848881609");
		    
		   WebElement object_day=wd.findElement(By.cssSelector("name='DOB_Dayc0965f7b'"));
		   object_day.clear();
		   Select option_day=new Select(object_day);
		   option_day.selectByVisibleText("26");
		   
		   WebElement object_month= wd.findElement(By.cssSelector("select[name='DOB_Monthc0965f7b'][onchange='fieldTrack(this);']"));
		   object_month.clear();
		   Select option_month=new Select(object_month);
		   option_month.selectByVisibleText("JUL");
		   
		   WebElement object_year= wd.findElement(By.cssSelector("name='DOB_Yearc0965f7b'"));
		   object_year.clear();
		   Select option_year=new Select(object_year);
		   option_year.selectByVisibleText("1975");
		   
		   wd.findElement(By.cssSelector("[value='f']")).click();
		   Thread.sleep(4000);
		   
		   
	    
	   
	    
	   
	   
	   
	   
	   
    
	    
	    
		  
	   
	   
	   
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	

}
