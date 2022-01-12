package interactions.Mouse;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();

		WebElement jobs = driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));

		Actions actions = new Actions(driver);

		actions.moveToElement(jobs).perform();

		WebElement Register = driver
				.findElement(By.xpath("//a[contains(@data-ga-track,'Main Navigation Jobs|Register Now')]"));

		actions.pause(2000).click(Register).perform();

		Set<String> ALLWINDOWS = driver.getWindowHandles();
		System.out.println("allwindows sixe is " + ALLWINDOWS.size());

		for (String Eachwindow : ALLWINDOWS) {
			driver.switchTo().window(Eachwindow);

			String Runtimetitle = driver.getTitle();

			if (Runtimetitle.equals("Register on Naukri.com: Apply to Millions of Jobs Online")) {
				break;
			}

		}

		System.out.println("reg title is" + driver.getTitle());

		WebElement login = driver
				.findElement(By.cssSelector("button[class='uploadResume resman-btn-primary resman-btn-small']"));

		// new Actions(driver).moveToElement(login).click(login).perform();

		actions.moveToElement(login).click(login).perform();

	}

}
