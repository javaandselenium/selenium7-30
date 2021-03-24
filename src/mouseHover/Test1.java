package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

		WebElement ele = driver.findElement(By.id("gh-ac"));
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();

	}

}
