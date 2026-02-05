package samplePrograms;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		System.out.println("Parent Window title =" +driver.getTitle());
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String ParentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		String text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		driver.close();
		driver.switchTo().window(ParentWindow);
	System.out.println("parent window");
	driver.close();
		
		
	}

}
