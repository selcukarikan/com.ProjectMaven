package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class C01_Maven {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //class in basinda implicitlywait komutu yazilirsa
        //bu test boyunca her locator icin driver maximum yazilan zamana kadar bekler

      //1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com");
        //2- arama kutusunu locate edelim
        WebElement suchenBox= driver.findElement(By.id("twotabsearchtextbox"));
        //3- “Samsung headphones” ile arama yapalim
        suchenBox.sendKeys("Iphone SE 2020"+ Keys.ENTER);
        //4- Bulunan sonuc sayisini yazdiralim
        //WebElement ergebnisse= driver.findElement(By.className("class=\"a-section a-spacing-small a-spacing-top-small"));
       //By.className ile llocate ettigimiz webelementinde class atribunun degerinde
        //bosluk varsa locater calismayabilir
        WebElement ergebnisse=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(ergebnisse.getText());
        //5- Ilk urunu tiklayalim
        //WebElement ilkUrunElementi=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
        //ilkUrunElementi.click();
        // sadece bir click yapacaksak webelemnt olusturmaya ve assign etmeye gerek yok
        // direk locate edip sonra click yapabiliriz
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
        Thread.sleep(3000);
        //6- Sayfadaki tum basliklari yazdiralim
        driver.navigate().back();
        List<WebElement> urunlerListesi= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement each:urunlerListesi
        ) {
            System.out.println(each.getText());
        }
    }
}




