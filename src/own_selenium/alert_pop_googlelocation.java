package own_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert_pop_googlelocation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//chromeoption object
	ChromeOptions op = new ChromeOptions();
	//disabled notification parameter
	op.addArguments("--disabled notification");
	//configure options parameter to chromedriver
	
	WebDriver sam = new ChromeDriver(op);
	sam.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	sam.get("https://www.google.com/");
	sam.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("olx",Keys.ENTER);
	sam.quit();

	
}
}
