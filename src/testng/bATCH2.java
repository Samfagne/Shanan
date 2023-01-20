package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class bATCH2 {
	@Test
	public void N3() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver diu = new ChromeDriver();
		diu.get("https://peachmode.com/");
		Reporter.log("anroid version 3",true);
	}
	@Test
	public void N2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver diu = new ChromeDriver();
		diu.get("https://www.ajio.com/");
		Reporter.log("anroid version 3",true);
	}
	@Test
	public void N1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver diu = new ChromeDriver();
		diu.get("https://www.amazon.in/");
		Reporter.log("anroid version 3",true);
	}	

}
