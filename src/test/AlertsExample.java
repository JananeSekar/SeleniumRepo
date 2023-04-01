package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		
		WebElement element = driver.findElement(By.xpath("//button[@id='alertButton']"));
		element.click();
		
		Alert obj = driver.switchTo().alert();
		Thread.sleep(2000);
		obj.accept();
		System.out.println("Accepting");
		
		WebElement scrollTo = driver.findElement(By.id("confirmButton"));
		JavascriptExecutor scrolobj = (JavascriptExecutor) driver;
		scrolobj.executeScript("arguments[0].scrollIntoView();", scrollTo);
		
		WebElement element1 = driver.findElement(By.id("confirmButton"));
		element1.click();
		System.out.println("Rejecting");
		
		obj = driver.switchTo().alert();
		Thread.sleep(2000);
		obj.dismiss();

	}

}
