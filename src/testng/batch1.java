package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class batch1 {
@Test
public void w1() {
	System.setProperty("webdriver. chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver diu = new ChromeDriver();
	diu.get("https://www.udemy.com/");
	Reporter.log("anroid version",true);
	
}
@Test
public void w2() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver diu = new ChromeDriver();
	diu.get("https://in.coursera.org/");
	Reporter.log("anroid version 2",true);
}
@Test
public void w3() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver diu = new ChromeDriver();
	diu.get("https://www.selenium.dev/");
	Reporter.log("anroid version 3",true);

}
}
