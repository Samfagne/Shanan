package testng_methods_with_return_type;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 {
	@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement text;
	public Homepage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String verifyText1() {
		String actText = text.getText();
		return actText;
		
	}
	public String verifyText() {
		// TODO Auto-generated method stub
		return null;
	}

}
