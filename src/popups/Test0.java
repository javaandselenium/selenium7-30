package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
	driver.findElement(By.xpath("//input[@value='Click here for output>>']")).click();
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	Thread.sleep(3000);
	a.accept();
	driver.close();
	
	
	

	}

}
