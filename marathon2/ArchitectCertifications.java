package marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ArchitectCertifications extends BaseClass {

	@Test
	public void runArchitectCertificate() throws InterruptedException {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>lstwindow =new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstwindow.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow shadow =new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		WebElement mouseHover = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions builder =new Actions(driver);
        builder.moveToElement(mouseHover).perform();
        shadow.findElementByXPath("//a[text()='Salesforce Certification']").click();
		driver.findElement(By.xpath("//div[text()='Architect']")).click();
		System.out.println(driver.getCurrentUrl());
		String text=driver.findElement(By.xpath("(//h1[text()='Salesforce Architect']/following::div)[1]")).getText();
		System.out.println(text);
		System.out.println("Available Certificates for Architect");
		System.out.println("---------------------------------------");
		List<WebElement> certificate =driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		for (WebElement webElement : certificate) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		System.out.println("Available certicates for Application Architect");
		System.out.println("-------------------------------------------------");
		List<WebElement> archcertificate = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		for (WebElement webElement : archcertificate) {
			String text2=webElement.getText();
			System.out.println(text2);
		}
		
		
	}
}
