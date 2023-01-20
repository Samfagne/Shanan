import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.key_class;

public class scrolldown_up_robot {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver deo= new ChromeDriver();
	deo.get("https://www.amazon.in/");
	Robot s= new Robot();//keypress
	s.keyPress(KeyEvent.VK_PAGE_DOWN);
	s.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	s.keyPress(KeyEvent.VK_PAGE_DOWN);
	s.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	s.keyPress(KeyEvent.VK_PAGE_DOWN);
	s.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	s.keyPress(KeyEvent.VK_PAGE_DOWN);
	s.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	s.keyPress(KeyEvent.VK_PAGE_DOWN);
	s.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	
	
	
	
	
	
	
	}
	

}
