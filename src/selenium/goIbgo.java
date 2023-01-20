package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goIbgo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver aero= new ChromeDriver();
		aero.get("https://www.goibibo.com/");
		aero.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[1]/div/div/p"));
		aero.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[2]/div/div[1]/p"));
		
	}

}
