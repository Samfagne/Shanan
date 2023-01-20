package own_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class by_navigate {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver g =new ChromeDriver();
	g.navigate().to("https://www.google.co.in/");
	Thread.sleep(10000);
	g.navigate(). back();
	g.navigate().refresh();
	g.manage().window().minimize();
	g.get("https://www.netflix.com/in/login");
	Thread.sleep(6000);
	g.manage().window().maximize();
	g.findElement(By.id("id_userLoginId")).sendKeys("9096262209");
	g.findElement(By.name("password")).sendKeys("12345678@");
	g.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
	String title= g.getTitle();
	System.out.println("title as per");
	String expT= g.getTitle();
	String acT= g.getTitle();
	if(expT.contentEquals(acT)) {
		System.out.println("tc is pass");
	}
	else {
		System.out.println("tc is fail");
}

	
}

	
	
}
