package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_alert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver div= new ChromeDriver();
	div.get("https://demo.guru99.com/test/delete_customer.php");
	div.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
	div.findElement(By.xpath("//input[@name='submit']")).click();
	//first of all we need to switch the control of selenium from webpage to popup
	 Alert alt = div.switchTo().alert();
	 alt.accept();
	 //alt.dismiss();
	  String text = alt.getText();
	 System.out.println(text);
	
	
}
}

