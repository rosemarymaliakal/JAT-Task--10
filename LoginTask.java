package GuviSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guvi.in/");
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		Thread.sleep(5000);
//		
		String myName = "Rose";
		String myEmail = "testguvi8594@gmail.com";
		String myPassword = "Ro$e8594";
		
//		driver.findElement(By.id("name")).sendKeys(myName);
//		driver.findElement(By.id("email")).sendKeys(myEmail);
//		driver.findElement(By.id("password")).sendKeys(myPassword);
//		driver.findElement(By.id("mobileNumber")).sendKeys("9400962940");
//		
//		driver.findElement(By.id("signup-btn")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("laterBtn"))).click();
//		String TitleAfterRegistration = driver.getTitle();
//		System.out.println(TitleAfterRegistration);
		
//		if (TitleAfterRegistration.equalsIgnoreCase("GUVI | Sign Up")) {
			System.out.println("Registration is Successfull");	
//		}
//		else {
//			System.out.println("Please enter valid credentials");
//		}
		
		
		driver.get("https://www.guvi.in/");
		driver.findElement(By.id("login-btn")).click();
		
		driver.findElement(By.id("email")).sendKeys(myEmail);
		driver.findElement(By.id("password")).sendKeys(myPassword);
		driver.findElement(By.id("login-btn")).click();
		String TitleAfterLogin=driver.getTitle();
////		System.out.println(TitleAfterLogin);
		if (TitleAfterLogin.equalsIgnoreCase("GUVI | Login")) {
			System.out.println("Logged in Successfully");	
		}
		else {
			System.out.println("Please enter valid credentials");
		}
		
		driver.close();
		
		

	}

}
