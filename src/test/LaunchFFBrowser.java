package test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFFBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step1: Launch FF browser
		System.setProperty("webdriver.gecko.driver","geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");
		
// Step2 : Maximize		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		System.out.println("Title is:" + driver.getTitle());
//Step3 : Search for login and click		
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		String location = loginLink.getAttribute("href");
		System.out.println(location);
		loginLink.click();
		
		WebElement userLink = driver.findElement(By.name("user_login"));
		userLink.sendKeys("asdas@abc.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Ajjk@ab123");
		
		WebElement buttonlink = driver.findElement(By.name("btn_login"));
		buttonlink.click();
		
		WebElement errmsg = driver.findElement(By.className("error_msg"));		
				
				String message = errmsg.getText();
				//String expErrorMsg = "The email or password you have entered is invalid.";
System.out.println("Error is: " + message);
				
WebElement error = driver.findElement(By.className("error_msg"));
String message1 = error.getText();
String expErrorMsg = "The email or password you have entered is invalid.";

if(error.isDisplayed() && message1.equals(expErrorMsg)) {
	
	System.out.println("TC Passed");
}else {
	
	System.out.println("TC Failed");
}

/*				
		WebElement forgotpwd = driver.findElement(By.linkText("Forgot Password?"));
		forgotpwd.click(); */


List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
System.out.println(AllLinks.size());

for (WebElement link:AllLinks) {
	
	System.out.println(link.getAttribute("href"));
}
				
//driver.close();			
		
	}

}
