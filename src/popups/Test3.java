package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.findElement(By.xpath("//button[text()='I am a Professional']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\QSP\\Documents\\Selenium 205\\Locators-w.docx");

	}

}
