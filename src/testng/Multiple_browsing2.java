package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiple_browsing2 {
	@Parameters("browsername")
	@Test
	public void f1(String browsername) {
		WebDriver diu = null;
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
			diu = new ChromeDriver();
		}
		else if(browsername.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			diu = new FirefoxDriver();
		}
		diu.get("https://www.opencart.com/");
	}
	

}
