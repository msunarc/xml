package page;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {
	
  public static void waitforElement(WebDriver driver,int timeInSeconds, By locator) {
	  WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  
  }
	
	
	public static void dropDown(WebElement string ,String visibleText) {
     Select sel = new Select(string);
     sel.selectByVisibleText(visibleText);
	}
	

	public static int randomNumGenerator(String webElement, String visibleText) {
		Random rnd = new Random();
		int randomNum=rnd.nextInt(999);
		return randomNum;
	}

	public static void takescreenshot(WebDriver driver,String nameOfScreenShot) {
		DateFormat dateformat =new SimpleDateFormat("dd-mm-yyyy HH-MM-SS");
		Date date=new Date();
		String timestamp = dateformat.format(date);
		TakesScreenshot takescreenshot= ((TakesScreenshot)driver);
		File source= takescreenshot.getScreenshotAs(OutputType.FILE);
	File file=new File(".\\picture\\snap.png");
	if (!file.exists())
		file.mkdir();
	try {
		FileUtils.copyFile(source, new File(".\\picture\\snap"+ nameOfScreenShot + timestamp + ".png"));
	}catch (Exception e) {
		e.printStackTrace();
	
	}
	
	
	
	
	}
}


