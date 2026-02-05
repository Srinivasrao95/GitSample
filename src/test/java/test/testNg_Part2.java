package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNg_Part2 {

    @Test
    public void naveen(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naveenautomationlabs.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test
    public void API(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testing.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
