package test;

//import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoologin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			WebElement number = driver.findElement(By.xpath("//input[@autocomplete='username']"));
			number.sendKeys("9600904567");
			
			
			WebElement Next = driver.findElement(By.xpath("//div[@dir='auto']"));
			Next.click();
			//driver.close();
			
			;
	}

}
