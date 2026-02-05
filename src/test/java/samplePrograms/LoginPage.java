package samplePrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement((By.xpath("//label[text()='Email']/following-sibling::input[1]"))).sendKeys("Ssr");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

        js.executeScript("window.scrollBy(15000,15000");
        driver.findElement(By.xpath(("//td[text()='Maria Anders']/preceding-sibling::td/child::input"))).click();

        driver.findElement(By.xpath("//td[text()='Helen Bennett']/preceding-sibling::td/child::input")).click();

        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='contactList']/child::tbody/tr"));
        System.out.println("headers in the table are below");
        System.out.println(headers.size());
        for (WebElement header : headers) {
            System.out.print(header.getText());
        }
    }
}
