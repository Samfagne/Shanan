package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver b= new ChromeDriver();
		b.get("https://www.google.co.in/");
		Thread.sleep(4000);
		b.manage().window().maximize();//close method
		b.close();
		
	}

}
