package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo {
	@FindBy(id="twotabsearchtextbox")
	private WebElement sercahTb;
	
	public Demo(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void search(String product) {
		sercahTb.sendKeys(product);
	}

}
