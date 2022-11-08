package week2.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
         String  title= driver.getTitle();
         System.out.println(title);
         driver.findElement(By.linkText("CRM/SFA")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("princial");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("edward");
		driver.findElement(By.name("firstNameLocal")).sendKeys("princy");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		driver.findElement(By.name("description")).sendKeys("5 years experience in Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sample@testleaf.com");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
	}

}
