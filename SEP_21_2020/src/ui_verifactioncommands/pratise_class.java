package ui_verifactioncommands;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class pratise_class {

	public static void main(String[] args) throws MalformedURLException {
		
		
		/*PROXY = "11.456.448.110:8080"
				chrome_options = WebDriver.ChromeOptions()
				chrome_options.add_argument('--proxy-server=%s' % PROXY)
				chrome = webdriver.Chrome(chrome_options=chrome_options)
				chrome.get("https://www.google.com")*/
		
		
		/* DesiredCapabilities capability = DesiredCapabilities.firefox();
         driver = new RemoteWebDriver(new URL("http://**My ip**:4444/wd/hub"),  
         capability);
         baseUrl = "http://phy05:8080";*/
         
		/*String nodeURL1 = “http://169.254.111.81:1339”;
			System.setProperty(“webdriver.chrome.driver”,”F:\\chromedriver.exe”);
			DesiredCapabilities capability1 = DesiredCapabilities.chrome();
			capability1.setBrowserName(“chrome”);
			capability1.setPlatform(Platform.WIN8_1);
			driver = new RemoteWebDriver(new URL(nodeURL1), capability1);
			driver.get(“http://www.google.com“);
*/	
		System.setProperty("webdriver.chrome.driver","E:\\eclip\\practise\\Project_1(basic)\\chromedriver_1.exe");
		WebDriver driver=new ChromeDriver();
		String base_url = "http://localhost:8084";     
		Proxy proxy = new Proxy();     
		proxy.setProxyAutoconfigUrl(base_url);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.PROXY, proxy);
		RemoteWebDriver d= new RemoteWebDriver(capabilities);
	//selenium = new WebDriverBackedSelenium(driver, base_url);
		


	}

}
