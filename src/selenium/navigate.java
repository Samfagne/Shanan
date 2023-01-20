 
package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver f = new ChromeDriver();
	f.navigate().to("https://qrcodescan.in/");
	f.navigate().back();//forword
	f.navigate().forward();//refresh the browser
	f.navigate().refresh();
	
}
}
