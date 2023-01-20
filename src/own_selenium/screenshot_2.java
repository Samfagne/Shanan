package own_selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot_2 {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver cloths = new ChromeDriver();
		cloths.get("https://www.flipkart.com/");
	WebElement	us = cloths.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img"));
	File winter =us.getScreenshotAs(OutputType.FILE);
	File src = new File("C:\\Users\\LENOVO\\Desktop\\screen postman\\flipcart.jpg");
	Files.copy(winter, src);
	//Exception in thread "main" org.openqa.selenium.WebDriverException: unknown error: unhandled inspector error: {"code":-32000,"message":"Cannot take screenshot with 0 width."}
	 // (Session info: chrome=108.0.5359.125)
	
	}

}
