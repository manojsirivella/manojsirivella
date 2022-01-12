package ui_verifactioncommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class practise_class_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\eclip\\practise\\Project_1(basic)\\chromedriver_1.exe");
		/*DesiredCapabilities d= DesiredCapabilities.chrome();
		d.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions ch=new ChromeOptions();
		ch.merge(d);*/
		WebDriver wd=new ChromeDriver();
		wd.get("https://whatismyipaddress.com/ip/103.90.156.214");
		wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		wd.manage().window().maximize();
	    /*WebElement	username=wd.findElement(By.xpath("//*[@id='userName']"));
	    username.sendKeys("admin");
	    Thread.sleep(2000);
	    WebElement passwd=wd.findElement(By.xpath("//*[@id='pcPassword']"));
	    passwd.sendKeys("admin");
	    Thread.sleep(2000);
	    WebElement login_button=wd.findElement(By.xpath("//span[@id='loginBtnText']"));
	    login_button.click();
	    Thread.sleep(15000);
	  WebElement net= wd.findElement(By.xpath("//span[text( )='Network']"));
	  */
		
		//StringBuilder urlbuild=new StringBuilder("http://");
		//StringBuilder urlbuild=new StringBuilder("https:\\");
		//urlbuild.append("192.168.0.1"); //total url after append is http://103.90.156.214/
		//wd.navigate().to(urlbuild.toString());
		
		//https://whatismyipaddress.com/ip/103.90.156.214
		

	}

	
	/*//http://103.90.156.214/
	http://103.90.156.214/
	http://103.90.156.214/
	http://103.90.156.214/
	http://192.168.0.1/
	http://192.168.0.1/
*/}
