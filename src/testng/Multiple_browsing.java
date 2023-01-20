package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiple_browsing {
	@Parameters("browsername")//annotation

	@Test
	public void TC(String browsername) {//Parameterized method
		//Declared the global variable//
		WebDriver driver = null;//runtime polymorphism
		//apply condtions
		if (browsername.equals("chrome")) {
			//for chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
		else if(browsername.equals("firefox")){
				
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://www.udemy.com/");
		}
}