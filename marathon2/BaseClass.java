package marathon2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ChromeDriver	driver;
	@Parameters ({"url","username","password"})
	@BeforeMethod
	
	public void launchBrowser(String url, String uname, String pawd) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pawd);
		driver.findElement(By.id("Login")).sendKeys(Keys.ENTER);
		
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
}
}
