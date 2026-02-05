import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypesofXpaths {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//xpath with Functions
		//text()
		//driver.findElement(By.xpath("//a[text()='Sign in into account']")).click();
		//driver.navigate().back();
		//contains()
		//driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		//driver.navigate().back();
		//text starts-with
		driver.findElement(By.xpath(""));
		//normalize-space
		//label[normalize-space(text())='Username or Email']
		
	//It provides the last value
	//xpath: (//table[@id='contactList']/tbody/tr)[last()]
    /*xpath axes
     * preceding sibling, following sibling,
     * //td[text()='Francisco Chang']/preceding-sibling::td/child::input
     */
	}

}
