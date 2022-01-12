package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiveElement {

	/*sometimes selenium fail to identify ajax list due to diffent property architecture.
    * In that case we can use activeElement method to target object which is focused
    * at webpage.
    */*/
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver,40);
		
		// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("pagelet_bluebar"))));
// wait.until(ExpectedConditions.visibilityOf 
// (driver.findElement(By.xpath("//span[@class='select2-selection__rendered']"))));
 
		WebElement SelectCountry=driver.findElement(By.cssSelector("span[class='select2-selection select2-selection--single']"));
		
		//new Actions(driver).click(SelectCountry);
		
		SelectCountry.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().activeElement().sendKeys("Hong Kong");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
//note here Element not reachable exception is occuring every time to overcome to use cSSselector
	}

}
