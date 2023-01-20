package own_selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot_logo {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.snapdeal.com/");
driver.manage().window().minimize();
 WebElement river = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[1]/a[1]/img"));
 File us =river.getScreenshotAs(OutputType.FILE);
 File we = new File("C:\\Users\\LENOVO\\Desktop\\screen postman\\north.jpg");
 Files.copy(us, we);


}
}
