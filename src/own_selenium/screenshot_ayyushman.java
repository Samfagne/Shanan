package own_selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot_ayyushman {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver deo = new ChromeDriver();
		deo.get("https://mera.pmjay.gov.in/search/login");
		deo.manage().window().maximize();
		WebElement ed =deo.findElement(By.xpath("/html/body/div[2]/div/div[2]/a/img"));
		File src =ed.getScreenshotAs(OutputType.FILE);
		File desk = new File("C:\\Users\\LENOVO\\Desktop\\screen postman\\ayush.jpg");
		Files.copy(src, desk);
		
	}

}
