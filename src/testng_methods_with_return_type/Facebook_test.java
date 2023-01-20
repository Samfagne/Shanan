package testng_methods_with_return_type;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_test {
	Sheet sh;
	WebDriver driver;
	Facebook_loginpage l;
	Facebook_homepage h;
	
	@BeforeClass
		public void openbrowesr() throws Throwable {
		FileInputStream fis = new FileInputStream("D:\\sheet2.xlsx");
	  sh =  WorkbookFactory.create(fis).getSheet("sheet2");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver  = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.facebook.com/");
		 //all objects we need to create
	 l = new Facebook_loginpage(driver);
		h = new Facebook_homepage(driver);
	}
	@BeforeMethod
	public void openApp() {
		 String username = sh.getRow(0).getCell(0).getStringCellValue();
		 l.enterEmail(username);
		 String password  = sh.getRow(0).getCell(1).getStringCellValue();
		 l.enterPwd(password);
		 l.clickLoginbtn();
	}
	@Test
	public void verifyText() {
		Reporter.log("running verifyText",true);
		String exptText = sh.getRow(0).getCell(2).getStringCellValue();
		 String actText = h.verifytext();
		 Assert.assertEquals(exptText, actText);
	}
	
	
		 @AfterMethod
		 public void logout() {
			 Reporter.log("logout from app",true);
		 }
	
@AfterClass
public void closeBrower() {
	Reporter.log("close the browser",true);
	
		
				
		
	}

}
