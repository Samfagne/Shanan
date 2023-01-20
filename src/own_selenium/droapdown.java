package own_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class droapdown {
	public static void main(String[] args) throws Throwable {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	Thread.sleep(5000);
	driver.get("https://www.opencart.com/index.php?route=account/register");
	Thread.sleep(4000);
	WebElement dropcountryele = driver.findElement(By.id("input-country"));
	Select dropcountry = new Select( dropcountryele);
	Thread.sleep(5000);//we hav match the speed of chrome and eclips
	dropcountry.selectByVisibleText("Denmark");//this all are select method 
	//dropcountry.selectByIndex(14);
	//dropcountry.selectByIndex(15);
	
	}
	
		
	}


