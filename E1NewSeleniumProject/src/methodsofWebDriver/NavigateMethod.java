package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); //to launch the browser
		driver.navigate().to("https://www.flipkart.com/"); // to launch the application
		Thread.sleep(1000);
		
		driver.navigate().back();//to navigate backward
		Thread.sleep(1000);
		
		driver.navigate().forward();//to navigate forward
		Thread.sleep(1000);
		
		driver.navigate().refresh();//to refresh

	}

}
