package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg_Part3 {


    @Test
    public void RestAssured(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.restassured.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
