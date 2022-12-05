package marathan1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		//driver.executeScript("argument[0].click();",sales);
		WebElement acc =driver.findElement(By.xpath("//a[@title='Accounts']//span"));
		driver.executeScript("arguments[0].click();", acc);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Janaki");
		driver.findElement(By.xpath("(//button[@role='combobox'])[3]")).click();
		driver.findElement(By.xpath("//span[@title='Public']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String attribute = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']/a")).getAttribute("title");
		System.out.println(attribute);
		
		if(attribute.contains("Janaki")) {
			System.out.println("account was created");
		}
		else {
			System.out.println("account was not created");
		}
		
		
			}

}
