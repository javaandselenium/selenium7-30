package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.id("nav-link-accountList"));
     if(ele.isEnabled()) {
    	 System.out.println("pass:element is enabled");
    	 ele.click();
     }
     else
     {
    	 System.out.println("Fail:element is not enabled");
     }
     Thread.sleep(3000);
     driver.close();
	}

}
