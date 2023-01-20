package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACTION_CLASS {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//chose the target element
		 WebElement target  = driver.findElement(By.xpath("//a[text()='Gmail']"));
		 //create a object of action class
		 Actions act = new Actions(driver);
		 //use movetoelement method
		 act.moveToElement(target).perform();
		 //right click on target element
		 act.contextClick(target).perform();
		 //leftclick(click)
		 act.click(target).perform();
		 //double click//
		 act.moveToElement(target).doubleClick().perform();
		 
	}

}
