package own_selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshort {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.postman.com/downloads/");
	WebElement sam =driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/nav/a/div/img"));
	//use getscreenshot method
	File src= sam.getScreenshotAs(OutputType.FILE);
	File dest= new File("C:\\Users\\LENOVO\\Desktop\\screen postman\\perticular.jpg");
	//use copy method
	Files.copy(src, dest);
	
	
	
}

}
