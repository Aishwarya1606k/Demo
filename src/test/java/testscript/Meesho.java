package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AK69931\\eclipse-workspace\\sample-project\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		try {
		
		driver.get("https://www.meesho.com/");
		  driver.manage().window().maximize();
	}catch(Exception ex) {
		
	}

}
}