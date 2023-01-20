package own_selenium;

import java.nio.channels.NonWritableChannelException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroli_handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://web.whatsapp.com/");
		JavascriptExecutor jaw = (JavascriptExecutor)d;
		jaw.executeScript("window.scrollBy(0,5000);");
		jaw.executeScript("window.scrollBy(0,-1000);");
	}

}
