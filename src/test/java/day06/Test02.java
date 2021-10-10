package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test02 {
    static WebDriver driver;
    WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Was suchen Sie?'][1]"));

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.mediamarkt.de/");
    }

    @Test
    public void test1() {
        searchBox.clear();
        searchBox.sendKeys("waschmaschine" + Keys.ENTER);
        System.out.println("TEST PASS");

    }

    @Test
    public void test2() {
        searchBox.clear();
        searchBox.sendKeys("grill" + Keys.ENTER);
        System.out.println("TEST PASS");

    }
    @Test
    public void test3() {
        searchBox.clear();
        searchBox.sendKeys("kopfhörer bluetooth" + Keys.ENTER);
        System.out.println("TEST PASS");
    }
    @AfterClass
    public static void tearDown() {
        driver.close();

    }

}
