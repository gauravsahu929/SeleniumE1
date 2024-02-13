package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-d42vah0/login.do");
		Thread.sleep(2000);
		
		WebElement usernm = driver.findElement(By.className("textField"));
	    usernm.sendKeys("admin");
        
	    WebElement passwo = driver.findElement(By.name("pwd"));
	    passwo.sendKeys("manager");
	    
	    
	}

}
