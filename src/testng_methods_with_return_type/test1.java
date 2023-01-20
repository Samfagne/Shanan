package testng_methods_with_return_type;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
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

public class test1 {
	Sheet sh;
	WebDriver driver;
	LoginPage l;
	Homepage1 h;
	@BeforeClass
	public void openBrowser() throws Exception, Throwable {
		FileInputStream fis= new FileInputStream("D:\\sheet1.xlsx");
		 sh = WorkbookFactory.create(fis).getSheet("sheet1");
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.actitime.com/login.do");
		 //all objects we need to create
	 l = new LoginPage(driver);
		h = new Homepage1(driver);
	}
	@BeforeMethod
	public void openApp() {
		 String username = sh.getRow(0).getCell(0).getStringCellValue();
		 l.enterUN(username);
		 String password  = sh.getRow(0).getCell(1).getStringCellValue();
		 l.enterPassword(password);
		 l.clickloginButton();
	}
	@Test
	public void verifyText() {
		Reporter.log("running verifyText",true);
		String exptText = sh.getRow(0).getCell(2).getStringCellValue();
		 String actText = h.verifyText();
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
