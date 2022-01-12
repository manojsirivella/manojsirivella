package interactions.Mouse;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Action {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		WebElement jobs = driver.findElement(By.xpath("//div[.='Jobs']"));
		Actions action=new Actions(driver);

		action.moveToElement(jobs).perform();

		WebElement registerNow = driver
				.findElement(By.cssSelector("a[data-ga-track='Main Navigation Jobs|Register Now']"));

		action.click(registerNow).perform();
		
		
		Set<String> ALLWINDOWS = driver.getWindowHandles();
		
		System.out.println("all windows size is "+ALLWINDOWS.size());

		for (String eachwindowis : ALLWINDOWS) {
			
		  
			
			driver.switchTo().window(eachwindowis);

			//String RuntimeTitle = driver.getTitle();

			if (driver.getTitle().contains("Register on Naukri.com: Apply to Millions of Jobs Online"));
				
			{
				/*Thread.sleep(2000);

				WebElement login = driver
						.findElement(By.cssSelector("button[class='uploadResume resman-btn-primary resman-btn-small']"));

				new Actions(driver).moveToElement(login).click(login).perform();
				break;
				*/
				break;
			}

		}
          System.out.println("reg title is"+driver.getTitle());
		

		WebElement login = driver
				.findElement(By.cssSelector("button[class='uploadResume resman-btn-primary resman-btn-small']"));

		new Actions(driver).moveToElement(login).click(login).perform();

         // reg title isJobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com
	}
}
