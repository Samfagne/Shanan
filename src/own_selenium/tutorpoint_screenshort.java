package own_selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class tutorpoint_screenshort {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	Thread.sleep(3000);
	 WebElement sam  = driver.findElement(By.xpath("/html/body/header/nav/div/a/img[1]"));
	File papa = sam.getScreenshotAs(OutputType.FILE);
	File mom = new File("C:\\Users\\LENOVO\\Desktop\\s.short & testng report\\tutor.jpg");
Files.copy(papa, mom);

}
}

