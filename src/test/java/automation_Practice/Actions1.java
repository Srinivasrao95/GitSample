package automation_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/Vivo-V29-Red-256-RAM/dp/B0CLDRZ3MM/ref=sr_1_2?adgrpid=151558983543&hvadid=671716886525&hvdev=c&hvlocphy=9062140&hvnetw=g&hvqmt=e&hvrand=16686428683195142880&hvtargid=kwd-1373122907946&hydadcr=24572_2265458&keywords=vivo%2Bv29%2B5g&nsdOptOutParam=true&qid=1698851680&sr=8-2&th=1");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Baby Wishlist")).click();
	}

}
