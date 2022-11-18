package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) {
		try {
	 WebDriver driver = new ChromeDriver();
    
	driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=Bing_Brand_BMM_Desktop&utm_source=bing&msclkid=bc5fa9e82274111910cfca8082c7a664&utm_term=%2B.myntra&utm_content=Myntra_Generic");
    driver.navigate().to("https://www.google.co.in/");
    driver.navigate().back();
    Thread.sleep(2000);
    driver.navigate().forward();
    Thread.sleep(2000);
		
		
		}catch(Exception ex){
			System.out.println("Invalid");
			
		}
}
}