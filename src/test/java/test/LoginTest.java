package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.CustomerPage;
import page.loginpage;
import util.Browser;


public class LoginTest {
	WebDriver driver;
	loginpage login;
	@BeforeTest
	 public  void Launch() {
		driver=Browser.launch();
	}
	@Test
	@Parameters({"Username","Password"})
	public void Login(String username,String password) {
		 login =PageFactory.initElements(driver, loginpage.class);
	login.ValidUser(username);
	login.passwrd(password);
	login.enter();
	login.CustomerElement();
	login.AddCustomerElement();
}
}
		
			