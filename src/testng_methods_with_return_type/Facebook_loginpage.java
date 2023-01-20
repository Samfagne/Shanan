package testng_methods_with_return_type;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_loginpage {
	@FindBy(xpath ="//input[@id= 'email']")private WebElement Email;
	@FindBy(xpath = "//input[@id= 'pass']")private WebElement Pwd;
	@FindBy(xpath = "//button[@id= 'loginbutton']")private WebElement Loginbtn;
	public  Facebook_loginpage(WebDriver driver) {// constructor
		PageFactory.initElements(driver, this);
	}
	public void enterEmail(String username) {
		Email.sendKeys(username);
	}
	public void enterPwd (String password) {
		Pwd.sendKeys(password);
	}
	public void clickLoginbtn() {
		Loginbtn.click();
	
		
		
	}
		
		
		
		
		
	}


	
