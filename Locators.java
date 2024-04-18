package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {
public static void main(String[] args) throws InterruptedException {
    //Chromedriver =chromedriver.exe
    //Firefox=gekodriver.exe

   /* System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver-win64\\chromedriver.exe");
    //ChromeDriver driver = new ChromeDriver(); first way of implementation
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.google.com/");

//Launch Edge browser
    System.setProperty("webdriver.chrome.driver","F:\\Drivers\\edgedriver_win64\\msedgedriver.exe");
    //ChromeDriver driver = new ChromeDriver(); first way of implementation
    WebDriver driver =new EdgeDriver();
    driver.get("https://www.google.com/");*/

    //Using Webdriver manager API initialize the browser but first need to add Webdriver dependencies from maven
    //it will not require download latest driver no need to set any path

    WebDriverManager.chromedriver().setup(); //this can autoset the path
    WebDriver driver =new ChromeDriver();

 /*   WebDriverManager.edgedriver().setup();
    WebDriver driver1 =new EdgeDriver();*/
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");
    System.out.println("Title of Webpage: "+driver.getTitle());
    System.out.println("Get Current URL" +driver.getCurrentUrl());
    System.out.println("Get Page Source" +driver.getPageSource());
    driver.navigate().to("https://spurquest.com/");
    Thread.sleep(3000);
    driver.navigate().back();
    Thread.sleep(3000);
    driver.navigate().forward();
    driver.navigate().refresh();
    Thread.sleep(3000);
    driver.close();




}
}
