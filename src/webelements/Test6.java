package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		if(ele.isDisplayed()) {
			System.out.println("Pass:element is dispalyed");
			ele.sendKeys("book");
		}
		else
		{
			System.out.println("Fail:element is not dispalyed");
		}
		driver.close();

	}

}
