package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
        Point loc = ele.getLocation();
        System.out.println("x coordiate "+loc.getX());
        System.out.println("y coordinate "+loc.getY());
        driver.close();
	}

}
