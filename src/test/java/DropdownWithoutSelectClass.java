import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithoutSelectClass {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.findElement(By.id("course")).click();
	Thread.sleep(2000);
	List<WebElement> options=driver.findElements(By.xpath("//select[@id='course']//option"));
	for(WebElement element: options) {
		if(element.getText().equalsIgnoreCase("Javascript")) {
			element.click();
		}
	}
	driver.quit();
	

	}

}
/*
driver.findElement(By.id("option")).click();
List<WebElement> options =driver.findElements(By.xpath(" "));
for(WebElement element: options)
{
if(element.getText().equalsignorecase("javascript"))
{
element.click();
}
}

 */