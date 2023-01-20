package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//xpath of ele 
		 WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		 WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		 //create action class
		 Actions act = new Actions(driver);
		 act.dragAndDrop(ele1, ele2).perform();
	}

}
