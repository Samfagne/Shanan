package own_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop_up {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	driver.findElement(By.xpath("//button[@name='alertbox']")).click();
	 Alert alt  = driver.switchTo().alert();
	//alt.dismiss();
	String text  = alt.getText();
	System.out.println(text);
	}

}
