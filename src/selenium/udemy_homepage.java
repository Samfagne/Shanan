package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class udemy_homepage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver sam = new ChromeDriver();
		sam.get("https://www.udemy.com/join/signup-popup/");
		sam.findElement(By.id("form-group--1")).sendKeys("sampada fagne");
		sam.findElement(By.name("name")).sendKeys("sampadafagne@gmail.com");
		sam.findElement(By.name("password")).sendKeys("12345678");
		sam.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div[1]/div/div[2]/form/button")).click();
		
		
	}

}
