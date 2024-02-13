package HandlingDropdown;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///D:/dropdown.html");
		
		WebElement multiSelectDD = driver.findElement(By.id(""));
		
	
		Select sel = new Select(multiSelectDD);
		
	    TreeSet<String> ts = new TreeSet<String>() ;
	    
	    List<WebElement> options = sel.getOptions();
	    
	    for(WebElement we : options)
	    {
		
			String textToInsert = we.getText();
			ts.add(textToInsert);
	    }
	    for(String text : ts)
	    {
	    	System.out.println(text);
	    }

	}

}
