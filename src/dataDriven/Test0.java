package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
	WebDriver driver=new ChromeDriver();
	
	Properties p=new Properties();
	p.load(new FileInputStream("./data.Properties"));
	
	driver.get(p.getProperty("url"));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(p.getProperty("product"));
	//driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
	
	

}
}