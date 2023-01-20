package selenium;

import java.security.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class key_class {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver r =new ChromeDriver();
r.get("https://demo.actitime.com/login.do");
r.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
r.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);

}

}
