package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloDragAndDropAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/home");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("gauravsahu227@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("Gaurav@1234");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//div[text()='E1']")).click();
		
		//Source 
		WebElement javasrc = driver.findElement(By.xpath("//a[text()='Java']"));
		WebElement seleniumsrc = driver.findElement(By.xpath("//a[text()='Selenium']"));
		WebElement apisrc = driver.findElement(By.xpath("//a[text()='API']"));
		WebElement sqlsrc = driver.findElement(By.xpath("//a[text()='SQL']"));
		WebElement manualsrc = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		
		//target
		WebElement mockgiven = driver.findElement(By.xpath("//h2[text()='Mock Given']"));
		WebElement mockpending = driver.findElement(By.xpath("//h2[text()='Mock Pending']"));
		WebElement mockschedule = driver.findElement(By.xpath("//h2[text()='Mock Schedule']"));
		
		
		
		

	}

}
