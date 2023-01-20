package pom_designing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testopencart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver diu = new ChromeDriver();
	diu.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	diu.get("");
}
}
