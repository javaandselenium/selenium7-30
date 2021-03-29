package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//a[text()='10']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
