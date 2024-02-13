package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement Textfield = driver.findElement(By.xpath("//input[@name='q']"));
		Textfield.sendKeys("Hp Laptop");
		Thread.sleep(1000);
		
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		
		WebElement brand = driver.findElement(By.xpath("//div[text()='Brand']"));
		brand.click();
		
		driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//div[text()='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='RAM Capacity']")).click();
		driver.findElement(By.xpath("//div[text()='8 GB']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Windows 11']/preceding-sibling::div[@class='_24_Dny']")).click();
        Thread.sleep(1000);
        
		driver.findElement(By.xpath("//div[text()='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		
		List<WebElement> laptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		//laptopPrices = driver.findElements(By.xpath())
		
	}

}
