package samples;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allcodes {
	WebDriver driver;
	
	public  void systemproperty(){
	//system property and create object for chrome  driver class 
		System.setProperty("WebDriver.chrome .driver", "C:\\selenium working copychrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}
	
}