package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Stest04 {


    //c-Checkbox1 secili degilse onay kutusa tiklayiniz.
    //d-Checkbox2 secili degilse onay kutusuna tiklayiniz.

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //a- Verilen web sayfasina gidiniz.
        // https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

    }
    @Test
    public void test(){
        //b-checkbox1 ve checkbox2 elementlerini locate ediniz.
        WebElement checkBox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        //c-Checkbox1 secili degilse onay kutusa tiklayiniz.
        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        //d-Checkbox2 secili degilse onay kutusuna tiklayiniz.
        if (!checkBox2.isSelected()){
            checkBox2.click();
        }
    }

}
