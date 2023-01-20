package own_selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takescreen_snapdeal {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver  sampada = new ChromeDriver();
		sampada.get("https://www.snapdeal.com/");
		TakesScreenshot mona = (TakesScreenshot)sampada;
		File src = mona.getScreenshotAs(OutputType.FILE);
		File dsk = new File("C:\\Users\\LENOVO\\Desktop\\screen postman\\snapdealpage.jpg");
		Files.copy(src, dsk);
	}

}
