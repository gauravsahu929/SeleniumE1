package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-d42vah0/login.do");
		Thread.sleep(3000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//a[text()='Login']"));
		loginbutton.click();

	}

}
