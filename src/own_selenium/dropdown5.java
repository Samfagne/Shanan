package own_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.ui.Select;

public class dropdown5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("sampadafgne");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("malin");
		driver.findElement(By.id("input-lastname")).sendKeys("roy");
	WebElement countryele =	driver.findElement(By.xpath("//select[@id='input-country']"));
	
		Select country = new Select(countryele);
		country.selectByIndex(11);
		
		
	}
}


