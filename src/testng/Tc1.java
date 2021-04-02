package testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tc1 {
	public WebDriver driver;
	@BeforeMethod
	public void openApp() {
	 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("qwerty1234");
		driver.findElement(By.id("pass")).sendKeys("tyutrhjuhuy");
		driver.findElement(By.name("login")).click();
		String t = driver.getTitle();
		
		//Assert.assertEquals(t,"uiyryjgyuyu");
		SoftAssert s=new SoftAssert();
		s.assertEquals(t,"qwerty78o89");
		
		Reporter.log(t,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		s.assertAll();
		
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
