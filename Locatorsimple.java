package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locatorsimple {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/");
        Thread.sleep(5000);
        //name
        driver.findElement(By.name("search")).sendKeys("mac");
        Thread.sleep(3000);
        //id
      boolean logodisplay= driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(logodisplay);
        Thread.sleep(3000);

        //linked Text & Partial Linked Text
        driver.findElement(By.linkText("Tablets")).click();
        //driver.findElement(By.partialLinkText("tab")).click();
        List<WebElement>headerlinks = driver.findElements(By.className("list-inline-item"));  //return one single webelements
        System.out.println("Total number of header links: " +headerlinks.size());

        //Group of element by tagname() to locate group of webelements in case class name not available
List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links on webpage by using tag locator" +links.size());

        //Total number of images on webpages by using tagname() locator
        List<WebElement>images= driver.findElements(By.tagName("img"));  //For multiple webelements we can use List or Images
        System.out.println("Total number of images : " +images.size());

    }
}
