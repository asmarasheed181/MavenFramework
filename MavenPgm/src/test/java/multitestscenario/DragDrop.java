package multitestscenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {

	@Test
	public void DragDrops() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		//Thread.sleep(2000);
		
		driver.manage().window().maximize(); 
		Thread.sleep(2000);
		
	WebElement StartingPoint =	driver.findElement(By.xpath("//a[text()=' BANK ']"));
	
	WebElement TargetPosition = driver.findElement(By.id("bank"));
	
	Actions act = new Actions(driver);
	
	act.dragAndDrop(StartingPoint, TargetPosition).perform();  
	
	driver.quit();

	}

}
