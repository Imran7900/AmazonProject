package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbsignin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			WebElement Createnewaccount = driver.findElement(By.xpath("//*[contains(@data-testid,'open-registration')]"));
			Createnewaccount.click();
			
			
			WebElement Firstname = driver.findElement(By.xpath("//input[@aria-label='First name']"));
			WebElement Surname = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
			WebElement Mobilenumber = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
			WebElement password = driver.findElement(By.xpath("//input[@aria-label='New password']"));
			
			
			Firstname.sendKeys("imran");
			Surname.sendKeys("M");
			Mobilenumber.sendKeys("962345678");
			password.sendKeys("Tfyiguh@ghj");
			
			String strGender = "Male";
			String genXpath = "//label[text()='" + strGender + "']/following-sibling::input";
			
			WebElement gen = driver.findElement(By.xpath(genXpath));
			gen.click();
			
			List<WebElement> Months = driver.findElements(By.xpath("//select[@tittle='Month']/option"));
			for (WebElement elm:Months)
			{
				System.out.println(elm.getText());
			}
			WebElement CurrMonth = driver.findElement(By.xpath("//select[@title='Month']/option[@selected='1']"));
	        
	        System.out.println("Current Month " + CurrMonth.getText());
	        
	        WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
	        
	        Select ddDay = new Select(Day);
	        ddDay.selectByVisibleText("6");
	        
	        WebElement Month = driver.findElement(By.xpath("//select[@id='Month']"));
	        Select ddMonth = new Select(Month);
			ddMonth.selectByVisibleText("Jul");
			
			WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
			
			Select ddYear = new Select(Year);
			ddYear.selectByVisibleText("1999");


	        
	        
	        
	        
			
			
			

			
			

	}
	

}
