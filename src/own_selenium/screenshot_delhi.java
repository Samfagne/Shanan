package own_selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot_delhi {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver diu = new ChromeDriver();
		diu.get("https://www.holidify.com/places/delhi/sightseeing-and-things-to-do.html");
		Thread.sleep(3000);
		WebElement babi = diu.findElement(By.xpath("//img[@class='lg-object lg-image']"));
		 File sis = babi.getScreenshotAs(OutputType.FILE);
		 File bib = new File("C:\\Users\\LENOVO\\Desktop\\screen postman\\delhi.jpg");
		 Files.copy(sis, bib);
	}

}
