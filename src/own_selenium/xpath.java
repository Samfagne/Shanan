package own_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
	d.get("https://www.google.co.in/");
	d.findElement(By.name("q")).sendKeys("important days of india");
	d.findElement(By.xpath("/html/body")).click();
	
		
		
	}

}
