package interactions.Keyborad_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Element_To_Target {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		
		
		WebElement image1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement image2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
		WebElement image3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement image4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
		
		
		WebElement destination=driver.findElement(By.xpath("//div[@class='trash']"));
		
		
		Thread.sleep(3000);
		
		
		Actions actions=new Actions(driver);
		
		actions.dragAndDrop(image1,destination).perform();
		
		actions.dragAndDrop(image2, destination).perform();
		
		actions.clickAndHold(image3).moveToElement(destination).release().perform();
		
		actions.clickAndHold(image4).moveToElement(destination).release().perform();
		
		

	}

}
