package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sam4 {
	@Test
	public void s1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver jay = new ChromeDriver();
		jay.get("https://telegram.org/");
		jay.manage().window().maximize();
		jay.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("i m telegram channel", true);
	}
	@Test
	public void s2() {
	WebDriver m = new ChromeDriver();
	m.get("https://www.opencart.com/");
	Reporter.log("i m from s2",true);
	}

}
