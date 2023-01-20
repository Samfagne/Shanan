package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class fire_fox_driver {
	public void main (String[]args) {
		System.setProperty("web.gecko.driver", "C:\\Users\\LENOVO\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver g = new FirefoxDriver(); 
		g.get("http://www.amazon.in/");
	}

}
