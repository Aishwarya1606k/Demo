package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Automation_3 {
	public void valid() {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AK69931\\eclipse-workspace\\sample-project\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.nopcommerce.com/en");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement usericon=driver.findElement(By.xpath("//span[@class='user-actions-ico'][1]"));
		    WebElement register=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
			
			Actions act=new Actions(driver);
			Thread.sleep(3000);
			act.moveToElement(usericon);
			Thread.sleep(3000);
			act.click(register).build().perform();
			Thread.sleep(3000);
			
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
	}
	public void invalid() {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AK69931\\eclipse-workspace\\sample-project\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.nopcommerce.com/en");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement usericon=driver.findElement(By.xpath("//span[@class='user-actions-ico'][1]"));
		    WebElement register=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
			
			Actions act=new Actions(driver);
			Thread.sleep(3000);
			act.moveToElement(usericon);
			Thread.sleep(3000);
			act.click(register).build().perform();
			Thread.sleep(3000);
			
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
	        Email.sendKeys("546363.com");
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
	       
	       //Assert
	        WebElement a = driver.findElement(By.className("//div[@class='page-title'][1]"));
	        System.out.print(a.isDisplayed());
	        Assert.assertEquals(true,a.isDisplayed());
	        driver.close();
			 
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
	public static void main(String[] args) {
		try {
			Automation_3 a = new Automation_3();
			a.valid();
			a.invalid();
			
}catch(Exception ex) {
	}
	}
	}
