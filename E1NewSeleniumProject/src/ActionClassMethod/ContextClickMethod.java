package ActionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions act = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
		act.click(button).perform();
		WebElement rightClickLink = driver.findElement(By.partialLinkText("Right Click"));
		act.click(rightClickLink).perform();
		
		WebElement button1 = driver.findElement(By.xpath("//button[@id='btn30']"));
		act.contextClick(button1).perform();
		WebElement button1Option = driver.findElement(By.partialLinkText("//div[text()='Yes']"));
		act.click(button1Option).perform();
		
		WebELement button2 = driver.findElement(By.xpath("//button[]"))
		

	}

}
