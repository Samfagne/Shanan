package pom_designing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath ="//input[@id='username']" )private WebElement Un;
@FindBy(xpath = "//input[@name='pwd']")private WebElement PWD;
@FindBy(xpath="//div[text()='Login ']")private WebElement loginbtn;
//use constructor
public LoginPage (WebDriver driver){
	PageFactory.initElements(driver, this);
	
}
//getters and setters
public void enterun() {
	Un.sendKeys("admin");
}
public void enterpwd() {
PWD.sendKeys("manager");
}
public void clickLoginBtn() {
	loginbtn.click();
	
}
}