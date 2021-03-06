package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement ele = driver.findElement(By.id("gh-cat"));
		Select s=new Select(ele);
		
		s.selectByIndex(4);
		s.selectByVisibleText("Computers/Tablets & Networking");
		s.selectByValue("888");
		
		
		List<WebElement> op = s.getOptions();
		System.out.println(op.size());
		
		for(WebElement b:op) {
			System.out.println(b.getText());
		}
		
		
		
		driver.close();

	}

}
