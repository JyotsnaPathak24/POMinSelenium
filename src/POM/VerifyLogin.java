package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class VerifyLogin {
	
	public static void main(String[] args) { 
		WebDriver driver = BrowserFactory.BrowserOptions("Firefox", "https://demo.opencart.com/index.php?route=account/login");
		Opencartlogin LoginOpenCart =PageFactory.initElements(driver, Opencartlogin.class);
		LoginOpenCart.LoginOpenCart("hritik1810@gmail.com", "zSAr5aAT@eXP3dz");
}
}
