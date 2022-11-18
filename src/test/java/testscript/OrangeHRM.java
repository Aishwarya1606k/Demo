package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AK69931\\eclipse-workspace\\sample-project\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			 driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
			WebElement FirstName = driver.findElement(By.id("FirstName"));
	        WebElement LastName = driver.findElement(By.id("LastName"));
	        WebElement Email = driver.findElement(By.id("Email"));
	        WebElement ConfirmEmail = driver.findElement(By.id("ConfirmEmail"));
	        WebElement Username = driver.findElement(By.id("Username"));
	        WebElement check_availability_button = driver.findElement(By.id("check-availability-button"));
	        WebElement Country = driver.findElement(By.id("CountryId"));
	        WebElement Time = driver.findElement(By.id("TimeZoneId"));
	        //WebElement LogIn = driver.findElement(By.tagName("Log in"));
	        
	        FirstName.sendKeys("Aishwarya");
	        Thread.sleep(2000);
	        LastName.sendKeys("Kandalkar");
	        Thread.sleep(1000);
	        Email.sendKeys("aishwaryakandalkar16@gmail.com");
	        Thread.sleep(1000);
	        ConfirmEmail.sendKeys("aishwaryakandalkar16@gmail.com");
	        Thread.sleep(1000);
	        Username.sendKeys("Aishwarya");
	        Thread.sleep(1000);
	        check_availability_button.click();
	        Thread.sleep(1000);
	        Country.sendKeys("India");
	        Thread.sleep(1000);
	        Time.sendKeys("(UTC+05:30)Chennai,Kolkata,Mumbai,New Delhi");
	        Thread.sleep(1000);
	        
	        check_availability_button.click();
	        driver.close();
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}

	}}
