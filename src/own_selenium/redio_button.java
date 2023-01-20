package own_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redio_button {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/automation-practice-form");
	 WebElement	p  = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]"));
	 p.click();
	 System.out.println(p.isSelected());
	 System.out.println(p.isDisplayed());
		 
		 
		 
		 
		 
		 
		 
	}
	
	

}
