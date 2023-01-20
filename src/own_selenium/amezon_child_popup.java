package own_selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amezon_child_popup {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver nim = new ChromeDriver();
	nim.get("https://www.amazon.in/");
	nim.manage().window().maximize();
	nim.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watches under 5000",Keys.ENTER);
	nim.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	 Set<String> allwindows = nim.getWindowHandles();
	 ArrayList<String>al = new ArrayList<String>(allwindows);
	 String sam = al.get(0);
	 System.out.println(sam);
	 String cwind = al.get(1);
	 System.out.println(cwind);
	 Thread.sleep(4000);
	 String title= nim.getTitle();
	 System.out.println(title);
	 
	 
	
}
}

