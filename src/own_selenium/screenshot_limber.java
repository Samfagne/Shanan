package own_selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot_limber {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.drivrer", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		Thread.sleep(4000);
		d.get("https://1000logos.net/hyundai-logo/");
	WebElement	fagne= d.findElement(By.xpath("//*[@id=\"post-9673\"]/div[2]/p[1]/em/a/img"));
	File sam = fagne.getScreenshotAs(OutputType.FILE);
	File mom = new File("C:\\Users\\LENOVO\\Desktop\\screen postman\\perticular.jpg");
     Files.copy(sam, mom);
	}

}
