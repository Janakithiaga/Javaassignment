package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("Janaki");
        driver.findElement(By.id("lastNameField")).sendKeys("Thiaga");
        driver.findElement(By.name("submitButton")).click();
        WebElement firstname=driver.findElement(By.id("viewContact_firstName_sp"));
        System.out.println(firstname);
        System.out.println(driver.getTitle());
        driver.manage().window().minimize();
        
        
	}

}
