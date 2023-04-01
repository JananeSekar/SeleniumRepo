package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		//click on Create new Account
		
		WebElement signUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signUp.click();
		
		///WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		//firstName.sendKeys("Janane");
		
		WebElement firstName = driver.findElement(By.cssSelector("input[name=firstname]"));
		firstName.sendKeys("Janane");
		
		
		
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("Sekar");
		WebElement emailAd = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		emailAd.sendKeys("Janane@abc.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("Ajh@111");
		
		WebElement day = driver.findElement (By.xpath("//select[@title='Day']"));
		Select ddDay = new Select(day);
		ddDay.selectByVisibleText("11");
		
		WebElement month = driver.findElement (By.xpath("//select[@title='Day']"));
		Select mmMonth = new Select(month);
		mmMonth.selectByValue("1");
		
		List<WebElement> list = driver.findElements (By.xpath("//select[@name='birthday_month']/option"));
		for (WebElement months:list) {
			
			System.out.println(months.getText());
		}
		
			
			
		WebElement year = driver.findElement (By.xpath("//select[@title='Year']"));
		Select yyYear = new Select(year);
		yyYear.selectByVisibleText("1986");
		
		//label[text()='Female']
		
	String Gender = "Female";
	
	String dummyXpath = "//label[text()='placeholder']";
	String newXpath = dummyXpath.replace("placeholder", Gender); 
	WebElement genderEle = driver.findElementByXPath(newXpath);
	genderEle.click();
		
	}
	
}
