package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.CustomerPage;
import page.loginpage;
import util.Browser;

public class CustomerTest {
	WebDriver driver;
	
	CustomerPage customer;
	
	
	@Test
	@Parameters({"Name","Company1","Email","Phone","Address"})
	public void Login(String name,String company,String email,String phone,String address) {
		customer=PageFactory.initElements(driver, CustomerPage.class);

	customer.ListCustomerElement();
	customer.Full_name(name);
	customer.Company_Element(company);
	customer.email_Element(email);
	customer.Phone_Element(phone);
	customer.Address_Element(address);
	
}
}
