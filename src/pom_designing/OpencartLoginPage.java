package pom_designing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpencartLoginPage {
@FindBy(xpath = "//input[@id='input-email']")private WebElement email;
@FindBy(xpath="//input[@id='input-password']")private WebElement pwd;
@FindBy(xpath= "//button[text()='Login']")private WebElement loginbtn;
//use constructor
public OpencartLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	
}
//getters and setters
public void enterEmail() {
	email.sendKeys("rrehpade23@gmail.com");
}
public void enterPWD() {
	pwd.sendKeys("Sampada@123");
}
public void enterLoginbtn() {
	loginbtn.click();
	
}
}
