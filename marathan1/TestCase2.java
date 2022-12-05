package marathan1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {

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
		WebElement opp =driver.findElement(By.xpath("//a[@title='Opportunities']//span"));
		driver.executeScript("arguments[0].click();", opp);
	driver.findElement(By.xpath("//div[@title='New']")).click();
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Janaki");
	//driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys("Janaki");
	driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("11/10/2022");
	driver.findElement(By.xpath("(//button[@role='combobox'])[1]")).click();
	driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
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
