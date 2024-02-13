package methodsofWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();//to launch the browser
		Thread.sleep(1000);
		
		driver.manage().window().maximize();//to maximize the browser window
		Thread.sleep(1000);
		
		Point targetPoint = new Point(200,400);//to pass x and y co-ordination
		driver.manage().window().setPosition(targetPoint);

	}
}
