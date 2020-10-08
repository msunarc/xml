package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class CustomerPage {
	WebDriver driver;
	
	public CustomerPage(WebDriver driver) {
		this.driver=driver;
	
	}

	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'List Customers')]")
	WebElement ListCustomers_Locator;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Groups')]")
	WebElement Group_Locator;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement Name;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement Company1;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement Email;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement Address;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement City;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement State;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement Zip;
	@FindBy(how = How.XPATH, using = "//span[@id='select2-country-container']")
	WebElement Country1;
	@FindBy(how = How.XPATH, using = "//input[@class='select2-search__field']")
	WebElement Tags;
	@FindBy(how = How.XPATH, using = "//select[@id='currency']")
	WebElement Currency;
	@FindBy(how = How.XPATH, using = "//select[@id='group']")
	WebElement Group1;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//input[@id='cpassword']")
	WebElement ConfirmPassword;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement save;
	@FindBy(how = How.XPATH, using = "//div[@class='ibox-title']/a")
	WebElement importContact;


public void ListCustomerElement() {
	ListCustomers_Locator.click();
}
public void Groups_Element() {
	Group_Locator.click();
}
public void Full_name(String name) {
	String FullName =name+basepage.randomNumGenerator("//input[@id='account']", "Full Name");
	Name.sendKeys(FullName);
}
public void Company_Element(String company) {
	basepage.dropDown(Company1, company);
	Company1.sendKeys(company);
}
public void email_Element(String email) {
	String email_Element =basepage.randomNumGenerator("//select[@id='cid']']", "Email")+email;
	Email.sendKeys(email_Element);
}
public void Phone_Element(String phone) {
	String Phone_Element =basepage.randomNumGenerator("//select[@id='cid']']", "Phone")+phone;
	Phone.sendKeys(Phone_Element);
}
public void Address_Element(String address) {
	Address.sendKeys(address);
}
public void City_Element(String city) {
	City.sendKeys(city);
}
public void StateELement(String state) {
	State.sendKeys(state);
}
public void Zip_Element(String zip) {
	String Zip_Element=basepage.randomNumGenerator("//input[@id='zip']", "Zip")+zip;
	Zip.sendKeys(Zip_Element);
}
public void Country_Element(String country) {
	basepage.dropDown(Country1, "Country");
	Country1.sendKeys(country);
}
public void Tags(String tags) {
	Tags.sendKeys(tags);
}
public void CurrencyElement(String currency) {
	basepage.dropDown(Currency, "Currency");
	Currency.sendKeys(currency);
}
public void Group_Element(String group) {
	basepage.dropDown(Group1, group);
	Group1.sendKeys(group);
}
public void PasswordElement(String passworde) {
	Password.sendKeys();
}
public void ConfirmPasswordElement(String confirmpassword) {
	ConfirmPassword.sendKeys();
}
public void saveElement() {
	basepage.waitforElement(driver, 60, By.xpath("//Input[@id='account']"));
	save.click();
	basepage.takescreenshot(driver, nameOfScreenShot);
}

public void importContactElement() {
	importContact.click();
	
}


























}
