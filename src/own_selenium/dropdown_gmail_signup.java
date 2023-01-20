package own_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_gmail_signup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver deo = new ChromeDriver();
		deo.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		deo.findElement(By.name("firstName")).sendKeys("rasika");
		deo.findElement(By.name("lastName")).sendKeys("fagne");
		deo.findElement(By.name("Username")).sendKeys("rasikafagne");
		deo.findElement(By.name("Passwd")).sendKeys("Sampada@123");
		deo.findElement(By.name("ConfirmPasswd")).sendKeys("Sampada@123");
		deo.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();
		deo.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("9284278352");
		deo.findElement(By.name("recoveryEmail")).sendKeys("sampadafagne@gmail.com");
		 deo.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("23");
		WebElement monthele  =deo.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month = new Select(monthele);
		month.selectByVisibleText("May");
	}


}
