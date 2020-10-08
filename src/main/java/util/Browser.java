package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {
	 static WebDriver driver;
	 

	public static WebDriver launch() {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	
	}

}
