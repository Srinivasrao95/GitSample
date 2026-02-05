import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webDriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Select select=new Select(driver.findElement(By.id("course")));
		select.selectByIndex(1);
		Select select1=new Select(driver.findElement(By.xpath("//select[@id='ide']")));
		select1.selectByValue("vs");
		select1.selectByIndex(1);
		select1.selectByVisibleText("Eclipse");
		driver.close();
		
	}

}
