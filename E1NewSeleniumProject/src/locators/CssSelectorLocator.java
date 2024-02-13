package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		
		WebElement usnTB = driver.findElement(By.cssSelector("input[aria-label^='Ph']"));
		usnTB.sendKeys("1234");
		Thread.sleep(1000);
		
		WebElement passTb = driver.findElement(By.cssSelector("input[aria-label='Password']"));
		passTb.sendKeys("123456");
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
		loginButton.click();
	}

}
