package methodsofWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();//to launch the browser
		Thread.sleep(1000);
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();//to maximize
		Thread.sleep(1000);
		
		Dimension targetSize= new Dimension(500, 400);//to pass width and height to dimension class
		
		driver.manage().window().setSize(targetSize);
		

	}

}
