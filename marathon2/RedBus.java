package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	
	public ChromeDriver driver;
	@Test
	public void runRedBus() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//label[text()='Date']")).click();
		driver.findElement(By.xpath("//table//tr[3]//td[5]")).click();      
		
		WebElement search=driver.findElement(By.id("search_btn"));
		Actions builder=new Actions(driver);
        builder.click(search).perform();
        Thread.sleep(2000);
        String availbus = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
        System.out.println(availbus);
		driver.findElement(By.xpath("//label[text()='SLEEPER']")).click();
		String secondbus=driver.findElement(By.xpath("(//div[@class='clearfix bus-item-details'])[2]")).getText();
		System.out.println("The second resulting bus "+secondbus);
		driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
		WebElement scroll=driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[3]"));
		
		Actions builder1 =new Actions(driver);
		builder1.scrollToElement(scroll).perform();
		File source =driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Redbus/seats.png");
		FileUtils.copyFile(source, dest);
		
		
	
	
	}
	

}
