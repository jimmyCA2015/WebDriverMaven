package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	public static WebDriver driver;;
	@BeforeSuite
	public void setup() {
		driver=new ChromeDriver();
	}
	@Test
	public void doLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jimmy\\Desktop\\chromedriver.exe"); 
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("traiaane22r@way2automation.com");
		driver.findElement(By.id("identifierNext")).click();
	}
	@AfterSuite 
	public void tearDown() {
		driver.quit();
	}

}
