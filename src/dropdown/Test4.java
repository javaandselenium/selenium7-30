package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement ele = driver.findElement(By.id("month"));
         Select s=new Select(ele);
         s.selectByIndex(2);
         s.selectByVisibleText("May");
         
         List<WebElement> allOptions = s.getOptions();
         System.out.println(allOptions.size());
         
         ArrayList a=new ArrayList<>();
         for(WebElement b:allOptions) {
        	String text = b.getText();
        	System.out.println(text);
        	a.add(text);
         }
         System.out.println("***************after sorting********");
         Collections.sort(a);
         for(Object d:a) {
        	 System.out.println(d);
         }
         driver.close();
	}

}
