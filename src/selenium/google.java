package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver h = new ChromeDriver();
		h.get("https://demo.actitime.com/login.do");
		h.findElement(By.id("username")).sendKeys("admin");
		h.findElement(By.name("pwd")).sendKeys("manager");//click on log in button
		
		h.findElement(By.xpath("//div[text()='Login ']")).click();
		String title = h.getTitle();
			System.out.println(title);
		
		String expT = "actiTIME - Login";
		String acT = h.getTitle();
		if(expT.contentEquals(acT)) {
			System.out.println("tc is pass");
		}
		else {
			System.out.println("tc is fail");
		}
			
	}

}
