package pom_designing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement text;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
public void verifytext() {
		String expT= "Enter Time-Track";
		String actT= text.getText();
		if(actT.equals(actT)) {
			System.out.println("TC IS PASS");
		}
		else
		{
			System.out.println("tc is fail");
		}
	}

}
