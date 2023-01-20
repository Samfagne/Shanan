package own_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox { 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("priya");
		driver.findElement(By.name("lastname")).sendKeys("roy");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[5]/td[2]/input")).sendKeys("13 may 1990");
	
		
	}

}
