package interactions.Keyborad_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		
		WebElement location=driver.findElement(By.xpath("//input[@name='location']"));
		actions.sendKeys(location, "hyd").pause(2000).
		sendKeys(Keys.ARROW_DOWN).pause(2000).sendKeys(Keys.ENTER).perform();
		
		
		WebElement industry=driver.findElement(By.xpath("//input[@id='cjaInd']"));
		actions.sendKeys(industry, "it").pause(2000).sendKeys(Keys.ARROW_DOWN).
		sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		
		

	}

}
