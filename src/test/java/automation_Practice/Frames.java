package automation_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(11000,11000)");
		driver.findElement(By.id("name")).sendKeys("Srinivas");
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Select select =new Select(driver.findElement(By.id("course")));
		select.selectByVisibleText("Dot Net");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys(" Sure");
		driver.quit();
		

	}

}
