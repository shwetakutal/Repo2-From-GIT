package Selenium_HandOn;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Buttons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\ashwinraj.s\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/buttons");
        driver.manage().deleteAllCookies();

        //To click the button and navigate back to same page
        driver.findElement(By.id("home")).click();
       // Thread.sleep(5000);
        driver.navigate().back();

        //To get X and Y axis location of a button
        Point coordinates = driver.findElement(By.id("position")).getLocation();
        System.out.println("location of the button is: "+coordinates);

        //to find the color of the button
        String color = driver.findElement(By.id("color")).getCssValue("background-color");
        System.out.println("the color code of the button in RGB is: "+color);

        // to find the height and width of button
        Rectangle rect= driver.findElement(By.id("property")).getRect();
        Dimension sizes = rect.getDimension();
        System.out.println("the height of button is: "+sizes.height);
        System.out.println("the width of the button is: "+sizes.width);

        //to check whether button is enabled or not
        Boolean buttonIsEnabled = driver.findElement(By.id("isDisabled")).isEnabled();
        System.out.println("Is the button enabled: "+buttonIsEnabled);

        //to long press the button
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Button Hold!')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).clickAndHold().perform();
        Thread.sleep(20000);


        //driver.quit();
    }
}
