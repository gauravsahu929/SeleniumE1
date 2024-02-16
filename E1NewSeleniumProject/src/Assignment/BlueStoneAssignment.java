package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(5000);
		
		WebElement notnow = driver.findElement(By.xpath("//span[text()='Not now']"));
		notnow.click();
		
		
		WebElement coins = driver.findElement(By.id("goldCoins"));
		Actions act = new Actions(driver);
		act.moveToElement(coins).perform();
		
		

	}

}
