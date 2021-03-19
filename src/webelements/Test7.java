package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
        if(ele.isSelected()) {
        	System.out.println("Pass:element is selected");
        }
        else
        {
        	System.out.println("Fail:element is not selected");
        }
        driver.close();
	}

}
