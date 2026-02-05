import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Basic {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement((By.xpath("//input[@id='firstName']"))).sendKeys("Srinivas");
		driver.findElement((By.xpath("//input[@id='lastName']"))).sendKeys("Sure");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(2000,2000)");
		driver.findElement(By.id("malerb")).click();
		WebElement element = driver.findElement(By.id("englishchbx"));
		element.click();
		driver.findElement(By.id("spanishchbx")).click();
        driver.close();
	}

}
