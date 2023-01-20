package testng_methods_with_return_type;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@id=\"username\"]")private WebElement UN;
	@FindBy(xpath = "//input[@name=\"pwd\"]")private WebElement Password;
	@FindBy(xpath = "//div[text()=\"Login \"]")private WebElement loginButton;
	//intialisation
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	public void clickloginButton() {
		loginButton.click();
		
	}
	

}
