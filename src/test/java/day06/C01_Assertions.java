package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class C01_Assertions {

    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.bestbuy.com/");
    }
    @Test
    public void urlTest(){
        String expectedURL="https://www.bestbuy.com/";
        String actualURL= driver.getCurrentUrl();
        Assert.assertEquals("Istenen URL bulunamadi",expectedURL,actualURL);
    }
    @Test
    public void titleTest() {
        String istenmeyeKelime = "Rest";
        String actualTitle = driver.getTitle();
        Assert.assertFalse("istenmeyen kelime title var", actualTitle.contains(istenmeyeKelime));
    }@Test
    public void logoTest(){
        WebElement logo= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/img"));
        Assert.assertTrue("logo gorunmuyor", logo.isDisplayed());
    }@Test
    public void franceTest(){
        WebElement franceTest = driver.findElement(By.xpath("/html/body/div[1]/ul/li[2]/button"));
        Assert.assertTrue("logo gorunmuyor", franceTest.isDisplayed());
    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
}
