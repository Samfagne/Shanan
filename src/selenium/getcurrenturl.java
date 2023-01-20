package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver h = new ChromeDriver();//getcurrenturl method
		h.get("https://www.flipkart.com/");
	 String link = h.getCurrentUrl();
	 System.out.println(link);
	 h.close();
	}

}
