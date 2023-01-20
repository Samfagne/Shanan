package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Priority { 
	@Test(priority = 2)
	public void eshwar() {
		System.setProperty("webdriver.chrome.driver", " C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver die = new ChromeDriver();
		die.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		die.manage().window().maximize();
		die.get("https://www.flipkart.com/");
		Reporter.log("hi i m test case one", true);
	}
 @Test(priority = 3)
 public void raghu() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver die = new ChromeDriver();
		die.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		die.manage().window().maximize();
		die.get("https://www.amazon.in/");
		Reporter.log("hi i m test case two", true);
 }
 @Test (priority = 1)
 public void ram() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver die = new ChromeDriver();
		die.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		die.manage().window().maximize();
		die.get("https://www.meesho.com/");
		Reporter.log("hi i m test case three", true);
}
 }

 
