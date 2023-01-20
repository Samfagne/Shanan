package own_selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robot_pagedown {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_PAGE_DOWN);
		t.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		t.keyPress(KeyEvent.VK_PAGE_DOWN);
		t.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		t.keyPress(KeyEvent.VK_PAGE_UP);
		t.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(5000);
		t.keyPress(KeyEvent.VK_PAGE_UP);
		t.keyPress(KeyEvent.VK_PAGE_UP);
		d.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[1]/div/img")).click();
	
		
		
		
	}

}
