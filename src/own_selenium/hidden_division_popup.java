package own_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_division_popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dev = new ChromeDriver();
		dev.get("https://chercher.tech/practice/hidden-division-popup");
		dev.manage().window().maximize();
		dev.findElement(By.xpath("/html/body/a")).click();
	dev.findElement(By.xpath("/html/body/div/div/ul[1]/li[1]/button")).click();
	}

}
