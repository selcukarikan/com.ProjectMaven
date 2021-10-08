package day05;

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

public class C02_BeforeNotasyonu {

    //amazon sayfasina gidip 3 farkli test methodu hazirlayiniz
    //her method da farkli aramalar yapalim
    static WebDriver driver;
    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

    @AfterClass
    public static void tearDown(){
        driver.close();
    }
    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");

        }
    @Test
    public void test01() {
        searchBox.clear();
        searchBox.sendKeys("bycicle"+ Keys.ENTER);

    }
    @Test
    public void test02() {
    searchBox.clear();
        searchBox.sendKeys("nutella"+ Keys.ENTER);

    }
    @Test
    public void test03() {
    searchBox.clear();
        searchBox.sendKeys("umbrella" + Keys.ENTER);

    } }