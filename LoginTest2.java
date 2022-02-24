package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.gecko", "gechodriver.exe");
		
	WebDriver driver2 = new ChromeDriver();
	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebDriverWait wait = new WebDriverWait(driver,50);
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		
		
		LoginLink.click();
		WebElement UseName = driver.findElement(By.name("user_login"));
		WebElement Password = driver.findElement(By.name("user_pwd"));
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		
		
		
		UseName.sendKeys("xyz@avfadf.com");
		Password.sendKeys("\"Abc@12345");
		LoginBtn.click();
        WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		if(ActualMsg.equals(ExpMsg)) {
			System.out.println("TC Passed");
		}else {
			System.out.println("TC Failed");
			
		}
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		System.out.println("Total Links Are" + links. size());
		
		for(WebElement eln : links) {
			System.out.println(eln.getAttribute("href"));
		}
		
		
		driver.close();

		
		
		
	
	}
}
	