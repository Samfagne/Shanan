package own_selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class amezon_screenshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver f= new ChromeDriver();
		f.get("https://www.amazon.in/");
	WebElement sam=	f.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
	
	File d =sam.getScreenshotAs(OutputType.FILE);
	File m = new File("C:\\Users\\LENOVO\\Desktop\\screen postman\\amezon.jpg");
	Files.copy(d, m);
	
	}

}
