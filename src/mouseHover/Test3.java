package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");

		WebElement drag = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		
		WebElement drop = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	
	Actions a=new Actions(driver);
	a.dragAndDrop(drag,drop).perform();
	
		
	}

}
