package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				System.setProperty("webdriver.chrome.driver", "chromedriver");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
				WebElement UserName = driver.findElement(By.xpath("//input[@ id='user-name']"));
				
				UserName.sendKeys("standard_user");
				
				//List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
				//System.out.println(AllLinks.size());
				WebElement Password = driver.findElement(By.xpath("//input[@ id='password']"));
				
				Password.sendKeys("secret_sauce");
				
				WebElement login =driver.findElementByXPath("//input[@id='login-button']");
				login.click();
				
				WebElement item1 = driver.findElementByXPath("//div[text()='Sauce Labs Backpack']");
				item1.click();
				
				WebElement item1addcart = driver.findElementByXPath("//button[@id='add-to-cart-sauce-labs-backpack']");
				item1addcart.click();
				
				WebElement shopCart = driver.findElementByXPath("//a[@class='shopping_cart_link']");
				shopCart.click();
				
				WebElement checkOut = driver.findElementByXPath("//button[@id='checkout']");
				checkOut.click();
				
				WebElement FName = driver.findElement(By.xpath("//input[@id='first-name']"));
				
				FName.sendKeys("FName"); 
				
				WebElement LName = driver.findElement(By.xpath("//input[@id='last-name']"));
				
				LName.sendKeys("LName");
				
				WebElement zipCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
				
				zipCode.sendKeys("560048");
				
				WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
				
				Continue.click();
				
				WebElement finish = driver.findElementByXPath("//button[@id='finish']");
				finish.click();
				
				String completed = "Thank you for your order!";
				WebElement compMsg = driver.findElementByXPath("//h2[@class='complete-header']");
				String compText = compMsg.getText();

if(compMsg.isDisplayed() && compText.equals(completed)) {
	
	System.out.println("TC Passed");
}else {
	
	System.out.println("TC Failed");
}
				
				
				
				
				
				
	}

}
