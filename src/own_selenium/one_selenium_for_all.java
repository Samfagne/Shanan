package own_selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class one_selenium_for_all {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register");
		Thread.sleep(4000);
	
		driver.manage().window().maximize();
		
		Robot f = new Robot();
		f.keyPress(KeyEvent.VK_PAGE_DOWN);
		f.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		f.keyPress(KeyEvent.VK_PAGE_DOWN);
		f.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		driver.findElement(By.name("firstname")).sendKeys("rasika");
		driver.findElement(By.name("lastname")).sendKeys("gupta");
		driver.findElement(By.name("sex")).sendKeys("female");
		WebElement exele =driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[4]/td[1]/strong"));
		Select exper = new Select(exele);
		exper.selectByValue("6");
		WebElement contiele =driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[9]/td[2]/select"));
		Select conti = new Select(contiele);
		//conti.selectByVisibleText("Australia");
		conti.selectByValue("3");
		driver.quit();
		
		
		
		
	}

}
