package own_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	//implicit wait (global wait)
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//MAXIMIZE THE BROWSER
	driver.manage().window().maximize();
	//by default sel focus is on main webpage so we need to switch it
	//switch to 1st frame
	driver.switchTo().frame("PakageListFrame");
	//for our conformation take any element on 1st frame and print it
	String t1= driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
	System.out.println(t1);
	
}
}
