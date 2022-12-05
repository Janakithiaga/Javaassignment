package marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class AdministorCertification extends BaseClass{
	@Test
	public void runAdministorCertification() throws InterruptedException {
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
        driver.findElement(By.xpath("//div[text()='Administrator']")).click();
        driver.findElement(By.xpath("//a[text()='Administrator']")).click();
        System.out.println(driver.getCurrentUrl());
        String text1="Earn Your Credential";
        String text2=driver.findElement(By.xpath("//h1[text()='Earn your Credential']")).getText();
        if(text1.equalsIgnoreCase(text2)) {
        	System.out.println("Displayed available certifications");
        	
        }
        else {
        	System.out.println("Available certifications not displayed");
        }
	}

}
