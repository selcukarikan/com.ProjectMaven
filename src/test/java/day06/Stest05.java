package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Stest05 {

    WebDriver driver;

    @Before

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    public void test() {
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//*[.='Alle Cookies gestatten']")).click();
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
       WebElement radioButton=driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
        if (!radioButton.isSelected()){
            radioButton.click();
        }
    }
@After
    public void tearDown(){
// driver.close();
}
}
