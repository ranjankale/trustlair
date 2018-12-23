package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGoogle {
	 
	WebDriver driver;
	@BeforeTest
	public void btest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ranjan\\Desktop\\vaishnavi\\Ranjan_Demo_Maven\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Google"+"\n");
		driver.wait(5000);
		
	}
	
	@AfterTest
	public void atest()
	{
		driver.close();
	}
}
