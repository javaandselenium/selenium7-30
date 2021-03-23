package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
WebElement ele = driver.findElement(By.id("cars"));
Select s=new Select(ele);
s.selectByIndex(1);
Thread.sleep(3000);
s.selectByValue("99");
Thread.sleep(3000);
s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");

if(s.isMultiple()) {
	s.deselectByIndex(1);
	Thread.sleep(3000);
	s.deselectByValue("99");
	Thread.sleep(3000);
	s.deselectByVisibleText("INR 100 - INR 199 ( 16 ) ");
}
Thread.sleep(3000);
driver.close();

	}

}
