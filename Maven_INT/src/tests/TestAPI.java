package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAPI {
	

	@Test
	public void test()
	{ 
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Google"+"\n");
		driver.close();
	}
}
