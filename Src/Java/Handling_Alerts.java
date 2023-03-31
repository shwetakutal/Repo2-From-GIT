package Selenium_HandOn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\ashwinraj.s\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");
        driver.manage().deleteAllCookies();

        //handling simple alert
         driver.findElement(By.id("accept")).click();
         driver.switchTo().alert().accept();

         //handling confirm alert
        driver.findElement(By.id("confirm")).click();
        driver.switchTo().alert().dismiss();


        //handling prompt alert
        driver.findElement(By.id("prompt")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();

        //handling modern alert
        driver.findElement(By.id("modern")).click();
        Thread.sleep(Long.parseLong("3000"));
        driver.findElement(By.xpath("//button[@aria-label='close']")).click();

        driver.quit();




    }
}
