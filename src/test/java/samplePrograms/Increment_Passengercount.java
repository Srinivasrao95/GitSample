package samplePrograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Increment_Passengercount {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).click();
		int i = 1;
		while (i < 5) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}
		Alert alert = driver.switchTo().alert();
		alert.accept();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollby(5000,5000)");

	}

}
