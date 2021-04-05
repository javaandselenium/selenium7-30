package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		Demo d=new Demo(driver);
		driver.navigate().refresh();
		//ele.sendKeys("phone");
		d.search("phone");
		
		
	}

}
