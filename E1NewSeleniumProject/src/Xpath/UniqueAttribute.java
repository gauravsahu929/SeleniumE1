package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fireflink.com/");
		Thread.sleep(5000);
		
		
		
		WebElement email = driver.findElement(By.xpath("//input[@name='emailId']"));
		email.sendKeys("gauravsahu227@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Gaurav@1234");
		Thread.sleep(1000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		

	}

}
