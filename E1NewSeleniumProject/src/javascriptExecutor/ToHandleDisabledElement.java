package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(1000);
		
		//to typecast into javascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//to pass input to disabled element
		js.executeScript("document.getElementById('name').value='admin';");
		Thread.sleep(5000);
		
		//to clear
		js.executeScript("document.getElementById('name').value=''");
		

	}

}
