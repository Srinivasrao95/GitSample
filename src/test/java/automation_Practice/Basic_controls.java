package automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_controls {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(10000,10000)");
		driver.findElement(By.id("firstName")).sendKeys("Ssr");
		driver.findElement(By.id("lastName")).sendKeys("Sure");
		driver.findElement(By.id("malerb")).click();
		driver.findElement(By.id("latinchbx")).click();
		driver.findElement(By.id("spanishchbx")).click();
		driver.findElement(By.id("email")).sendKeys("srinu@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		driver.close();

	}

}
