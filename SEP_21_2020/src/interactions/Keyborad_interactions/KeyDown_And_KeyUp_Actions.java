package interactions.Keyborad_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_And_KeyUp_Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		new Actions(driver).keyUp(Keys.CONTROL).pause(2000).perform();
		
		//new Actions(driver).keyUp(Keys.CONTROL).perform();
		
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		
	//	new Actions(driver).keyUp(Keys.CONTROL).perform();
		
		

	}

}
