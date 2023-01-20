package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_overflow {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver div= new ChromeDriver();
		div.get("https://stackoverflow.com/questions/14344248/how-to-change-a-popup-windows-location");
		div.manage().window().maximize();
		div.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		div.switchTo().frame("/html/body/iframe");
	}

}
