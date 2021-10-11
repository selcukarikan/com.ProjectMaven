package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class STest06 {

    static WebDriver driver;
    @BeforeClass
    static public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void urlTest(){
        String expectedUrl="https://www.bestbuy.com/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals("istenen URL bulunamadi",expectedUrl,actualUrl);

    }
    @Test
    public void titleTest(){
        String istenmeyenKelime="Best";
        String actualTitle= driver.getTitle();
        Assert.assertFalse("istenmeyen kelime title da var",actualTitle.contains(istenmeyenKelime));
    }
    @Test
    public void logoTest(){
        WebElement logo= driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue("logo gorunuyor", logo.isDisplayed());
    }
    @Test
    public void FranceLink(){
        WebElement franceLink= driver.findElement(By.xpath("//button[text()='Français']"));
        Assert.assertTrue("Fransizca linki gorunmuyor", franceLink.isDisplayed());
    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
}
