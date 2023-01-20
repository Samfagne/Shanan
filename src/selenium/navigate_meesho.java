package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_meesho {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver f = new ChromeDriver();
		f.navigate().to("https://www.meesho.com/ ");
		f.navigate().back();
		f.navigate().forward();
		f.navigate().refresh();
	
	}

}
