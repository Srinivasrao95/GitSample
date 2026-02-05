package javaStreams;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sorting {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//thead/tr/th[1]")).click();
		
		List<WebElement> elementlist=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalele=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedlist=originalele.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist);
		Assert.assertTrue(originalele.equals(sortedlist));
		driver.close();

	}

}
