package own_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver T= new ChromeDriver();
		T.get("https://www.google.co.in/");
		T.findElement(By.className("gLFyf")).sendKeys("Justmarriage.com");
		T.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		
		Thread.sleep(3000);
		T.get("https://www.justmarriage.in/");
		T.findElement(By.id("txtname_static")).sendKeys("rasika mehra");
		WebElement profile = T.findElement(By.xpath("//*[@id=\"familist\"]"));
		Select s= new Select(profile);
		//use to select class method
		s.selectByIndex(4);
		//s.selectByVisibleText("Brother");
		
	}

}
