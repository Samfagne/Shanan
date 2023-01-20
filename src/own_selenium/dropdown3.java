package own_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver dev = new ChromeDriver();
	dev.get("https://www.google.co.in/");
	dev.get("https://iop.ignouonline.ac.in/");
	dev.findElement(By.xpath("//a[text()='Home']")).click();
	dev.findElement(By.xpath("//*[@id=\"featured-services\"]/div/div[1]/div[3]/a")).click();
	dev.findElement(By.id("body")).sendKeys("nationalstudents");
}
}