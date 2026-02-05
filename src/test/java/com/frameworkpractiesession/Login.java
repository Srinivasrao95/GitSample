package com.frameworkpractiesession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Login {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client/#/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.id("userEmail")).sendKeys("sure.srinivasarao95@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Srinivas@123");
        driver.findElement(By.id("login")).click();

        List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));

        WebElement prod=products.stream().filter(product->
                product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
    }
}
