package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
        WebElement ele = driver.findElement(By.id("username"));
	     ele.sendKeys("hhjhgggggggggggjhgjhgyutyujh");
	     Thread.sleep(4000);
	     ele.clear();
	     Thread.sleep(4000);
	     driver.close();
	}

}
