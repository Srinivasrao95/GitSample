package samplePrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksandImages {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));

		System.out.println("No of links available in Amazon home page-->" + links.size());

		List<WebElement> Activelinks = new ArrayList<WebElement>();

		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).getDomAttribute("href") != null
					&& (!links.get(i).getDomAttribute("href").contains("javascript")))
			{
				Activelinks.add(links.get(i));
				System.out.println("No of Active links available in Amazon home page-->" + Activelinks.size());
			}

			for (int j = 0; j < Activelinks.size(); j++) {

				HttpURLConnection connection = (HttpURLConnection) new URL(Activelinks.get(j).getDomAttribute("href"))
						.openConnection();
				connection.connect();
				String response = connection.getResponseMessage();
				connection.disconnect();
				System.out.println(Activelinks.get(j).getDomAttribute("href") + "------>" + response);
			}

		}

	}

}
