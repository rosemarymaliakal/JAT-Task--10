package GuviSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerTask {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		openUrl();
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='22']")).click();
		
		WebElement MyElement =driver.findElement(By.id("datepicker"));
		String SelectedDate = MyElement.getAttribute("value");
		System.out.println(SelectedDate);
		driver.close();
		driver.quit();

	}
	
	public static void openUrl() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
	}

}
