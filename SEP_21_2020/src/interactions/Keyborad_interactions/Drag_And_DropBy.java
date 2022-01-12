package interactions.Keyborad_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		
		
		driver.manage().window().maximize();
		
		//driver.switchTo().alert().accept();
		
	//	WebElement noti=driver.findElement(By.xpath("//img[@id='nv_userinfoimg']"));
	//	driver.switchTo().alert().accept();
		//noti.click();
	//	Thread.sleep(4000);
	//	WebElement x=driver.findElement(By.cssSelector("g[fill='#fff']"));
		//x.click();
		//driver.manage().deleteAllCookies();
		//Thread.sleep(4000);
		//driver.switchTo().alert().accept();
		
		WebElement Scroller1=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));
		
		WebElement Scroller2=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[2]"));
		
		WebElement Scroller3=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[3]"));
		
		
		Actions actions=new Actions(driver);
		
		actions.dragAndDropBy(Scroller1, 100, 0).perform();
		
		Thread.sleep(3000);
		
		actions.dragAndDropBy(Scroller2, 90, 0).perform();
		
		Thread.sleep(3000);
		
		actions.dragAndDropBy(Scroller3, 90, 0).perform();
		
		
		
		

	}

}
