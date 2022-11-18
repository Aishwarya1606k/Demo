package testscript;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AK69931\\eclipse-workspace\\sample-project\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
		try {
			
			  driver.get("https://www.myntra.com/");
			  driver.manage().window().maximize();
			//a[@data-group='men']
			 Thread.sleep(2000);
			 
			 WebElement men = driver.findElement(By.xpath("//a[@data-group='men'])"));
			 WebElement option = driver.findElement(By.xpath("//a[@data-reactid='168']"));
			 
			 Actions act= new Actions(driver);
			 act.moveToElement(men);
			//a[@data-reactid='168']
			 
		}catch(Exception ex) {
			
		}
	}
}
