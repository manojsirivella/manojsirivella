package ui_verifactioncommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Any_Single_Link_Available_At_Group_Link {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		driver.manage().window().maximize();
		
		WebElement alllinks=driver.findElement(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']"));
		
		String all_links_text=alllinks.getText();
		
		System.out.println("all links test is "+"\t"+ all_links_text);
		
		if(all_links_text.contains("Terms"))
			System.out.println("testpass");
		else
			System.out.println("testfail");
		
		
		

	}

}
