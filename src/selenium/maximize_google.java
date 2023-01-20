package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize_google  {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(8000);
	driver.manage().window().maximize();//closed mehod
	driver.close();
	//driver.get("https://www.google.co.in/ ");
	//Option opt = driver.manage();
	//window win = opt.window();
	//win.maximize();
}
}
