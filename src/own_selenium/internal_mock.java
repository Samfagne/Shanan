package own_selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class internal_mock {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver fuse = new ChromeDriver();
		fuse.get("https://www.nopcommerce.com/en/register");
		fuse.findElement(By.id("FirstName")).sendKeys("sampada");
		fuse.findElement(By.id("LastName")).sendKeys("fagne");
		fuse.findElement(By.id("Email")).sendKeys("sampadafagne@gmail.com");
		fuse.findElement(By.id("ConfirmEmail")).sendKeys("sampadafagne@gmail.com");
		
		fuse.findElement(By.name("Username")).sendKeys("sampadafagne");
		fuse.findElement(By.id("check-availability-button")).click();
		String acT = fuse.getTitle();
	System.out.println(acT);
	
	fuse.manage().window().maximize();
	String expT= "Register - nopCommerce";
	
		if(expT.equals(acT)) {
			System.out.println("tc pass");
		}
		else {
			System.out.println("fail");
		}
		WebElement countryele =fuse.findElement(By.xpath("//select[@id='CountryId']"));
		Select country = new Select(countryele);
		country.selectByIndex(13);
	Robot f = new Robot();
	f.keyPress(KeyEvent.VK_PAGE_DOWN);
	f.keyPress(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(5000);
	f.keyPress(KeyEvent.VK_PAGE_DOWN);
	f.keyPress(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(5000);
	f.keyPress(KeyEvent.VK_PAGE_UP);
	f.keyPress(KeyEvent.VK_PAGE_UP);
		
		
	}

}
