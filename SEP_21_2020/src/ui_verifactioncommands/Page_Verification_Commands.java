package ui_verifactioncommands;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Page_Verification_Commands {
	
	

	public static void main(String[] args) throws Exception {
	

		/*import org.openqa.selenium.Proxy;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.firefox.FirefoxOptions;
		public class proxyTest {
		  public static void main(String[] args) {
		    Proxy proxy = new Proxy();
		    proxy.setHttpProxy("1.2.3.4:2000");
		    ChromeOptions options = new FirefoxOptions();
		    options.setCapability("proxy", proxy);
		    WebDriver driver = new FirefoxDriver(options);
		    driver.get("http://www.find-ip.net");
		    driver.manage().window().maximize();
		    driver.quit();*/
		
		/*ChromeOptions capability = new ChromeOptions();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

		WebDriver driver = new ChromeDriver(capability);*/
		
		System.setProperty("webdriver.chrome.driver","E:\\eclip\\practise\\Project_1(basic)\\chromedriver_1.exe");
		
	
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("103.90.156.214");
		ChromeOptions options=new ChromeOptions();
		options.setCapability("x", proxy);
		
		
		/*options.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);*/
		WebDriver driver1=new ChromeDriver();
		
		
		driver1.get("http://192.168.0.1 ");
		
		driver1.manage().window().maximize();
		driver1.navigate().refresh();
		
	//	https://103.90.156.214/
		
		/*options.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);*/
		
	//	System.setProperty("webdriver.chrome.driver","E:\\eclip\\practise\\Project_1(basic)\\chromedriver_1.exe");
		
		/*WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://www.find-ip.net");
		
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(5000);*/
		//driver.quit();
		
		
		  }
		
	}







