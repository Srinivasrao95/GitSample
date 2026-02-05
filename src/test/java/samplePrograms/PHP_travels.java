package samplePrograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PHP_travels {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.linkText("Sign Up")).click();
		
		Set<String> str=driver.getWindowHandles();
		Iterator<String> it=str.iterator();
		
		String ParentWindow=it.next();
		System.out.println(ParentWindow);
		String ChildWindow=it.next();
		System.out.println(ChildWindow);
		
		driver.switchTo().window(ChildWindow);
		driver.findElement(By.id("inputFirstName")).sendKeys("Srinivas");
		
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
