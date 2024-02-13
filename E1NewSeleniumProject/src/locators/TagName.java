package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TagName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//launch browser
        driver.manage().window().maximize();//to maximize the browser
        driver.get("file:///C:/Users/Gaurav%20Sahu/Desktop/selenium/Html/Textfield.html");//to launch the web application
        Thread.sleep(2000);
        
        WebElement textbox = driver.findElement(By.tagName("input"));//find password textfield  on the webpage
        
        textbox.sendKeys("manager");//to pass the inputs to password textfield 
        
        
        
	}

}
