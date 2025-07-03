package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    public static void main(String[] args) {
        // No need to set driver path manually — Selenium Manager handles it!
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}
