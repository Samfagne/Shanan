package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class parallel1 {
@Test
public void f1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.nopcommerce.com/en");
 Reporter.log("i m running from f1", true);
 
	
	
}

}
