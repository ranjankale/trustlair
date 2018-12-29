package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestAPI {
	

	@Test
	public void test() throws Exception
	{ 
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver",path+"\\resources\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Google"+"\n");
		driver.close();
	}
}
