package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.concurrent.TimeUnit;

public class STest07 {

    static WebDriver driver;

    @BeforeClass

    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//*[text()='I Agree']")).click();


    }
    @Test
            public void titleTest() {
        String expectedTitle = "Youtube";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("sayfa title beklenenden farkli", expectedTitle, actualTitle);


    }
    @Test
            public void logoTest() {

        WebElement logo= driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        Assert.assertTrue("logo gorunmuyor",logo.isDisplayed());
    }
    @Test
            public void suchenBox() {
        WebElement suchenBox = driver.findElement(By.id("search-input"));
        Assert.assertTrue("Arama kutusuna ulasilmiyor", suchenBox.isEnabled());

    }
    @Test
            public void yanlisTitle() {
        String istenmeyenBaslik = "youtube";
        String actualTitle = driver.getTitle();
        Assert.assertNotEquals("false mesaji", istenmeyenBaslik, actualTitle);
    }
             @AfterClass
             public static void tearDown(){
            driver.close();
        }
}

