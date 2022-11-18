package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {
	public static void main(String[] args){
		try {
System.setProperty("webdriver.chrome.driver","C:\\Users\\AK69931\\eclipse-workspace\\sample-project\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
 driver.get("https://www.tms.pisystindia.com/siteengineer/login");
 driver.manage().window().maximize();
 Thread.sleep(8000);
 WebElement email=driver.findElement(By.id("siteengineer_email"));
 WebElement password=driver.findElement(By.id("siteengineer_password"));
 WebElement signupButton=driver.findElement(By.tagName("button"));
 email.sendKeys("siteengineer@gmail.com");
 Thread.sleep(3000);
 password.sendKeys("123456");
 Thread.sleep(3000);
 signupButton.click();
		}
		catch(Exception ex) {
			ex.printStackTrace();

}
	}
}