package test;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonSearch {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone 12");
		WebElement searchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtn.click();
		
		List<WebElement> name =driver.findElements(By.xpath("//span[@class ='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> price =driver.findElements(By.xpath("//span[@class ='a-price-whole']"));
		
		
		System.out.println("Search Results " + name.size());
		
		for (int count=0;count<name.size();count++) 
			if (name.get(count).getText().toLowerCase().contains("iphone 12")) 
				{
					System.out.println("name  : "+ name.get(count).getText() + "price  :" +price.get(count).getText());
				}
			
		}
		}
		
		

		
	



