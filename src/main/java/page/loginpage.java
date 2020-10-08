package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpage {
	WebDriver driver;
	
	public loginpage(WebDriver driver) {
	this.driver=driver;
	
}

		@FindBy(how=How.XPATH,using="//input[@id='username']")
		 WebElement Username;
		@FindBy(how=How.XPATH,using="//input[@id='password']")
		WebElement Password;
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	WebElement signin;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement Customers_Locator;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	WebElement AddCustomers_Locator;
	
	public void ValidUser(String username) {
		Username.sendKeys(username);
	}
	public void passwrd(String password) {
		Password.sendKeys(password);
	}
	public void enter() {
		
		signin.click();
	}
		public void CustomerElement() {
			Customers_Locator.click();
		}
		public void AddCustomerElement() {
			AddCustomers_Locator.click();
		}
	
	
	
	}
	

