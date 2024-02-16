package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformHorizonScrollingoperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;//to typecast from webdriver to javascriptEcecutor
		
		//To perform scroll-right operation
		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(2000);
		
		//To perform scroll- left operation
		js.executeScript("window.scrollBy(-150,0)");
		Thread.sleep(2000);
		
		driver.close();

	}

}
