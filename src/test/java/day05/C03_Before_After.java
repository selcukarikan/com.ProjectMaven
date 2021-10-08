package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C03_Before_After {

    //uc test methodunu yapin
    //1.method amazon.com
    //2.method techproeducationa
    //3.method facebook'a gitsin

    //eger her test methodu icin yeni bir sayfa acilsin ve test method'u sonunda kapansin
    //istiyorsak @before ve @after notasyonu kullanilmali
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void amazonTesti() {
        driver.get("https:www.amazon.com");
        System.out.println(driver.getTitle());
    }
    @Test
    public void arikanBilgisayar() {
        driver.get("https:www.arikanbilgisayar.com");
        System.out.println(driver.getTitle());
    }
    @Test
    public void facebook() {
        driver.get("https:www.facebook.com");
        System.out.println(driver.getTitle());
    }
@After
public void tearDown(){
        driver.close();
}
}
