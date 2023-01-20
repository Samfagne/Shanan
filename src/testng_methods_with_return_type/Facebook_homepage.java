package testng_methods_with_return_type;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_homepage {
	@FindBy(xpath = "//*[@id=\"mount_0_0_yW\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div/span/div/div[1]/h3/span/span")private WebElement text;
	public Facebook_homepage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String verifytext() {
		String actText = text.getText();
		return actText;
	}

}
