package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRM {
    WebDriver driver;

    @Test
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    public void login(){
       driver.findElement(By.name("username")).sendKeys("Admin");
       driver.findElement(By.name("password")).sendKeys("admin123");
       driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();

    }
    @Test
    public void myinfo(){
        driver.findElement(By.xpath("//span[text()='My Info']")).click();
        driver.findElement(By.name("firstName")).sendKeys("Ssr");
    }


}
