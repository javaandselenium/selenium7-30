package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("qwerty12334");
        driver.findElement(By.name("pass")).sendKeys("rtyygjhgjgfuu");
        
      //  driver.findElement(By.linkText("Forgotten password?")).click();
	
	driver.findElement(By.partialLinkText("password?")).click();
	}

}
