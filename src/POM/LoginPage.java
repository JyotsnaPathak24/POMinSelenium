package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	public static void main Opencartlogin(WebDriver driver) {
		this.driver= driver;	
	}
	@FindBy(how=How.ID, using="input-email")
	WebElement UserName;
	
	@FindBy(how =How.ID,using="input-password")
	WebElement Password;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement LoginButton;
	public void LoginOpenCart(String Uname, String Psd) {
		UserName.sendKeys(Uname);
		Password.sendKeys(Psd);
		LoginButton.click();
	}
}
