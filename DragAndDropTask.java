package GuviSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		Thread.sleep(4000);
		WebElement SourceElement = driver.findElement(By.xpath("//p[contains(text(),'Drag')]"));
		WebElement TargetElement = driver.findElement(By.xpath("//p[contains(text(),'Drop')]"));
		
		Actions myActions = new Actions(driver);
		myActions.dragAndDrop(SourceElement, TargetElement).perform();
		
		String DroppedColor = driver.findElement(By.cssSelector("#droppable")).getCssValue("color");
		System.out.println("Color changed to "+DroppedColor);
		
		String TextAfterDropping = TargetElement.getText();
		System.out.println("Text after dropping is changed to "+TextAfterDropping);
	}

}
