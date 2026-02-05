package samplePrograms;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluientWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://get.jenkins.io/windows-stable/2.426.1/jenkins.msi");
		driver.manage().window().maximize();
		String downloadpath = "C:\\Users\\LENOVO FAIN\\Downloads";
		String filename = "jenkins.msi";
		File file = new File(downloadpath, filename);

		FluentWait<File> wait = new FluentWait<File>(file)
				.withTimeout(Duration.ofMinutes(1))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class)
				.withMessage("File is not downloaded");

		Boolean isdownloaded = wait.until(f -> f.exists() && f.canRead());

		if (isdownloaded) {
			System.out.println("file is completly downloaded");
		} else {
			System.out.println("file is not completly downloaded");
		}

	}

}
