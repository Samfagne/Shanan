package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redifmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver f = new ChromeDriver();
		f.get("https://mypage.rediff.com/login/dologin");
		f.findElement(By.id("txtlogin")).sendKeys("sfagne@rediffmail.com");
		f.findElement(By.name("num")).sendKeys("parth78");
		f.findElement(By.xpath("//*[@id=\"pass_div\"]/input[3]")).click();
		String title = f.getTitle();
		System.out.println(title);
		String expT =" Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String acT = f.getTitle();
		if(expT.contentEquals(acT)) {
			System.out.println("tc is pass");
		}
		else {
			System.out.println("tc is fail");
}
	}
}
	


