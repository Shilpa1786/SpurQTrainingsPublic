package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAssignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //Is Displayed() IS Enabled()
        WebElement searchstore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("Element Displayed: " +searchstore.isDisplayed());
        System.out.println("Element Displayed: " +searchstore.isEnabled());

        //Is Selected()
          WebElement male =driver.findElement(By.xpath("//input[@id='gender-male']"));
          male.click();
        System.out.println(male.isSelected());

          WebElement female =driver.findElement(By.xpath("//input[@id='gender-female']"));
          female.click();
        System.out.println(female.isSelected());



    }
}
