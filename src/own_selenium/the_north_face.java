package own_selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class the_north_face {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver sam = new ChromeDriver();
		sam.get("https://www.thenorthface.com/en-us");
		TakesScreenshot s = (TakesScreenshot)sam;
	 File src	= s.getScreenshotAs(OutputType.FILE);
	File dsk = new File("C:\\Users\\LENOVO\\Desktop\\screen postman\\fullnorth.jpg");
	Files.copy(src, dsk);
		
		
		
	}
	
	
	

}
