package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[contains(text(),'Google Play')]")).click();
	}

}
