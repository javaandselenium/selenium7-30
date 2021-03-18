package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");


WebElement ele = driver.findElement(By.xpath("//div[text()='Login ']"));

WebDriverWait w=new WebDriverWait(driver,5);
w.until(ExpectedConditions.elementToBeClickable(ele)).click();

String title = driver.getTitle();
System.out.println(title);

if(title.equals("actiTIME - Login")) {
	System.out.println("Pass:home page is dispalyed");
}
else
{
	System.out.println("Fail:home page is not dispalyed");
}
driver.close();
	}

}
