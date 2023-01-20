package own_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dopdown23 {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(5000);
	driver.get("https://www.nopcommerce.com/en/register");
	driver.findElement(By.id("FirstName")).sendKeys("sampada");
	driver.findElement(By.id("LastName")).sendKeys("fagne");
	driver.findElement(By.id("Email")).sendKeys("sampadafagne@gmail.com");
	 WebElement six =driver.findElement(By.id("CountryId"));
	 Select country = new Select(six);
	 country.selectByVisibleText("India");
	WebElement fix = driver.findElement(By.id("Details_CompanyIndustryId"));
	Select prime = new Select(fix);
	prime.selectByValue("5");
	driver.findElement(By.xpath("//*[@id=\"register-page\"]/body/div[7]/section/div/div/div/div/div/div[2]/form/div/div[1]/div[2]/div[8]/div/label")).click();
	driver.findElement(By.id("register-button")).click();
		System.out.println(comments from github from TM);
	 
	 
	
	}

}
