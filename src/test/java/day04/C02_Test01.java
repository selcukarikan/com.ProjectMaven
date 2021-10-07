package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C02_Test01 {
    public static void main(String[] args) {
        //1-Test01 isimli bir class olusturun
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //2- https://www.walmart.com/ adresine gidin
        driver.get("https://www.wallmart.com");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4-Sayfayi “refresh” yapin
        driver.manage().window().maximize();
        //5- Sayfa basliginin “Save” ifadesi icerdigini control edin
        String actualTitle=driver.getTitle();
        String suchenWort="Save";
                if(actualTitle.contains(suchenWort)){
                    System.out.println("title"+suchenWort+"kelimesini iceriyor, TEST PASS");
                }else{
                    System.out.println("title"+suchenWort+"kelimesini icermiyor, TEST FAILED");
                }
        //6-Sayfa basliginin “Walmart.com | Save Money.Live Better” a esit oldugunu control ediniz
        String expectedTitle="Wallmart.com/Save Money.Live Better";
                if (expectedTitle.equals(actualTitle)){
                    System.out.println("sayfa Title 'i beklenen ile ayni, TEST PASS");
                }else{
                    System.out.println("title beklenen ile ayni degil");
                    System.out.println("actual title : "+actualTitle);
                }
        //7- URL in walmart.com icerdigini control edin
        String actualUrl=driver.getCurrentUrl();
                String urlArananKelime="wallmart.com";
                if(actualUrl.contains(urlArananKelime)){
                    System.out.println("URL : "+urlArananKelime+"kelimesi iceriyor TESTPASSED");
                }else{
                    System.out.println("URL"+urlArananKelime+"kelimesini icermiyor TESTFAILED");
                }
        //8-”Nutella” icin arama yapiniz
        WebElement suchenBox=driver.findElement(By.xpath("//input[@name='q']"));
                suchenBox.sendKeys("Nutella"+ Keys.ENTER);
        //9- Kac sonuc bulundugunu yaziniz
        WebElement sonucYazisiElementi=driver.findElement(By.xpath("//div[@class='inline-flex mv3-xl mt3 ml3 ml4-xl mr1 db']"));
        System.out.println(sonucYazisiElementi.getText());
        //10-Sayfayi kapatin
        driver.close();
    }
}
