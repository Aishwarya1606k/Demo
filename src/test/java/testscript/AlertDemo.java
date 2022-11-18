package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
		public static void main(String[] args) {
			
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AK69931\\eclipse-workspace\\sample-project\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://sweetalert2.github.io/v9.html");
			
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
			//Can't use when scrollBy
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("javascript:window.scrollBy(0,360)","");
			WebElement alert=driver.findElement(By.xpath("//div[@class = 'showcase normal']/button"));
		
			alert.click();
			Thread.sleep(5000);
			
			driver.switchTo().alert().accept();
			WebElement alert2=driver.findElement(By.xpath("//button[@class='show-example-btn'][1]"));
			js.executeScript("javascript:window.scrollBy(550,650)");
			
			alert2.click();
			Thread.sleep(5000);
			
			WebElement ok=driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
			js.executeScript("javascript:window.scrollBy(650,750)");
		
			ok.click();
			Thread.sleep(5000);
			
			WebElement tryme=driver.findElement(By.xpath("//button[@aria-label='Try me! Example: A basic message']"));
			js.executeScript("javascript:window.scrollBy(750,850)");
		
			tryme.click();
			Thread.sleep(5000);
		}	catch(Exception ex) {
			ex.printStackTrace();
			
		}
				
		}
}
