package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.out;

public class TestEbayKleinAnzeige {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //a.google web sayfasına gidin. https://www.google.com/
        driver.get("https://www.ebay-kleinanzeigen.de/");
        driver.manage().window().maximize();
        Thread.sleep(3500);
        //b. Search(ara) “mercedes s maybach”
        WebElement suchBox= driver.findElement(By.id("site-search-query"));
        suchBox.sendKeys("mercedes s maybach");
        //c. ort/Plz ( ) “Deutschland”
        WebElement ortBox= driver.findElement(By.id("site-search-area"));
        ortBox.sendKeys("Deutschland");
        //d. finden tusuna basiniz
        Thread.sleep(3400);
         WebElement finden= driver.findElement(By.xpath("//*[@id=\"site-search-submit\"]/span"));
         finden.click();
        //d. EbayKleinanzeige'de görüntülenen ilk ürünü göster
    WebElement ergebnisse=driver.findElement(By.xpath("//*[@id=\"srchrslt-adtable\"]/li[1]/article/div[2]/div[2]/h2/a"));
    ergebnisse.click();
        //. sayfayi kapatin
        driver.close();
    }
}