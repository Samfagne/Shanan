package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class parallel2 {
	@Test
	public void tc() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver diu = new ChromeDriver();
	 diu.manage().deleteAllCookies();
	 diu.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 diu.get("https://www.freejobalert.com/");
	 Reporter.log("i m free job alert",true);
	}

}
