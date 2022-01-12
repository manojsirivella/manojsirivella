package UI_validations_Commands;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src//chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://book.spicejet.com/");
		d.manage().window().maximize();
		
		WebElement loginbutton=d.findElement(By.xpath("//a[@id='Login']"));
		WebElement login=d.findElement(By.xpath("//a[@id='Login']"));
		
	Point loc	=loginbutton.getLocation();
	
	    int xcord=loc.getX();
	    int ycord=loc.getY();
	    
	    System.out.println(xcord+"\t"+ycord);
	    
	   int a=loginbutton.getLocation().getX();
	   int b=loginbutton.getLocation().getY();
	   System.out.println(a+"\t"+b);
	   
	  int h=login.getSize().getHeight();
	  int w=login.getSize().getWidth();
	  System.out.println("height and width is"+"\t"+h+"\t"+w);
	  
	Dimension  D=login.getSize();
     int	h1=D.height;
     int w2=D.width;
     
     System.out.println("height and width is "+"\t"+h1+"\t"+w2);
     
    int h3=login.getRect().getHeight();
    int   w3=login.getRect().getWidth();
    
   int x1=login.getRect().getX();
   int y2=login.getRect().getY();
   System.out.println(h3+" "+w3+" "+x1+" "+y2);
	   
	 
	   
		

	}

}
