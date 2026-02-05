package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_Part1 {
    WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    public void setup(String browser){
        switch (browser.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("invalid browser");
                break;
        }

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void facebooktest() {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("Srinivas");
        System.out.println(driver.getTitle());

    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
