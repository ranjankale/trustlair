package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAPI {
	WebDriver driver;
	
	@BeforeTest
	public void btest() {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver",path+"\\resources\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://localhost:7777/TestAUT/TestPage.html");
	}

	@Test
	public void test() throws Exception
	{ 
		driver.findElement(By.xpath("//button[@id='main_btn']")).click();
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement oldtable=driver.findElement(By.xpath("//table[@id='htb']"));
		oldtable.click();
		js.executeScript(" arguments[0].style.height='auto'; arguments[0].style.visibility='visible';",driver.findElement(By.xpath("//div[@id='pqr']")));
		driver.findElement(By.xpath("//div[@id='pqr']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='popup']/descendant::button[text()='Sneha']")).isDisplayed());
		WebElement cbtn=driver.findElement(By.xpath("//div[@class='popup']/descendant::button[text()='Sneha']"));
		cbtn.click();
		
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void atest() {
		driver.quit();
	}
	
}
