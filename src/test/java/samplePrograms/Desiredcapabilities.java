package samplePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Desiredcapabilities {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setAcceptInsecureCerts(true);
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.merge(capabilities);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://www.cacert.org/");

	}

}
