package own_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class dropdown4 {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver r=new ChromeDriver();
	r.get("https://demo.nopcommerce.com/register");
	r.findElement(By.xpath("//*[@id=\"gender\"]/span[2]/label")).click();
	r.findElement(By.id("FirstName")).sendKeys("sampada");
	r.findElement(By.id("LastName")).sendKeys("Rehpade");
	WebElement Dayelement = r.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));
	 Select day = new Select(Dayelement);
	 day.selectByIndex(23);
	 WebElement monthele =r.findElement(By.name("DateOfBirthMonth"));
	 
	Select month = new Select(monthele);
	month.selectByIndex(5);
	WebElement yearele = r.findElement(By.name("DateOfBirthYear"));
	Select y = new Select(yearele);
	y.selectByVisibleText("1990");
	//scroll handling method
	JavascriptExecutor h = (JavascriptExecutor)r;
	h.executeScript("window.scrollBy(0,6000);");
	Thread.sleep(4000);
  h.executeScript("window.scrollBy(0,-1000);");

	
	
	
	
	
	
	
}
}
