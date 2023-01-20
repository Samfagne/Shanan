package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pakage_popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver div = new ChromeDriver();
		div.get("https://www.flipkart.com/");
		div.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	}

}
