package testng;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sam5 {
@ Test
public void j1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver so = new ChromeDriver();
	so.get("https://telegram.org/");
	Reporter.log("i m passed from j1",true);
	Assert.fail();
}
@Test
public void j2() {
WebDriver so = new ChromeDriver();
so.get("https://www.whatsapp.com/");
Reporter.log("i m whatsApp", true);
}
}