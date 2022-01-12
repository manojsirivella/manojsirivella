package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_RightClick_Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		
		WebElement rightclickme=driver.findElement(By.xpath("//span[.='right click me']"));
		
		new Actions(driver).contextClick(rightclickme).perform();
		
		WebElement delete=driver.findElement(By.xpath("//span[.='Delete']"));
		
		new Actions(driver).click(delete).perform();
		
		driver.switchTo().alert().accept();
	}

}
