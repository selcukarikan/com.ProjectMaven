package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class STest03 {

    WebDriver driver;


    @Before

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    public void ebayTest() {
        driver.get("https://www.ebay.de");
        System.out.println(driver.getTitle());

    }

    @Test
    public void saturnTest() {
        driver.get("https://www.saturn.de");
        System.out.println(driver.getTitle());
    }

    @Test
    public void check24Test() {
        driver.get("https://www.check24.de");
        System.out.println(driver.getTitle());
    }
    @After
            public void tearDown(){
    driver.close();
}}
