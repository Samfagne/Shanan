package own_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//findelement()....return the single webelement
		
		
		//1 
		//WebElement searchbox =driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		//searchbox.sendKeys("xyz");
		
		
		//2
		//multiple web elements locator we reusing still we get single web element in print
		//WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		//System.out.println(ele.getText());
		
		
		
		//find elements method() return multiple web elements depend on locator which we pass
		List<WebElement> links =driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("number of value capture:"+links.size());
		
	}

}
