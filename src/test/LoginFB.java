package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("jananewewewsekar@gmail.com");
		WebElement passWord = driver.findElement(By.id("pass"));
		passWord.sendKeys("23ewd32e");
		//WebElement buttonlink = driver.findElement(By.name("login"));
		//buttonlink.click();
		WebElement NewUser = driver.findElement(By.linkText("Create new account"));
		NewUser.click();

		// driver.close();

	}
}
