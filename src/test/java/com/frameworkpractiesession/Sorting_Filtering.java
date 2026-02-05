package com.frameworkpractiesession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Sorting_Filtering {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//thead/tr/th[1]")).click();
        List<WebElement> lists = driver.findElements(By.xpath("//tbody/tr/td[1]"));

        List<String> originallist = lists.stream().map(s -> s.getText()).collect(Collectors.toList());

        List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(originallist.equals(sortedlist));

        List<String> price = lists.stream().filter(s ->
                s.getText().contains("Beans")).map(s -> getpriceveggie(s)).collect(Collectors.toList());

        price.forEach(s-> System.out.println(s));

    }

    private static String getpriceveggie(WebElement s) {
        String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return pricevalue;
    }


}
