package search;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Search {
	@BeforeSuite
	public void setup() {
		System.out.println("--------Set Up--------------");
		System.setProperty("webdriver.chrome.driver", "..//chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.get("https://www.google.com/");
		
	}

	@Test
	public void TC_001() {
		WebElement e = this.driver.findElement(By.xpath("//input[@id='lst-ib']"));
		e.sendKeys("Implement test case #1");
	}

	
	
	@AfterSuite
	public void tearDown() {
		this.driver.quit();
	}

	WebDriver driver;
}
