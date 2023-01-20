package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import collection.array_list;

public class child_popup {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver diu = new ChromeDriver();
	diu.get("https://www.flipkart.com/");
	diu.manage().window().maximize();
	diu.findElement(By.xpath("//button[text()='✕']")).click();
	diu.get("https://www.flipkart.com/");
	diu.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 20000",Keys.ENTER);
	Thread.sleep(4000);
	diu.findElement(By.xpath("//div[text()='MOTOROLA g52 (Charcoal Grey, 128 GB)']")).click();
	Thread.sleep(5000);
Set<String> allwindows = diu.getWindowHandles();
//create object of arraylist
	ArrayList<String> al = new ArrayList<String>(allwindows);
	//print main window id
	String mainid = al.get(0);
	System.out.println(mainid);
	//switch to child window
	diu.switchTo().window(al.get(1));
	//print session id
	String cwind = al.get(1);
	System.out.println(cwind);
	Thread.sleep(5000);
	String title = diu.getTitle();
	System.out.println(title);
	
}
}
