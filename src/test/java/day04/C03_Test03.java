package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Test03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       //“https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
        //2. Username kutusuna “standard_user” yazdirin
        WebElement userName= driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        //3. Password kutusuna “secret_sauce” yazdirin
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        //4. Login tusuna basin
        WebElement login= driver.findElement(By.id("login-button"));
        login.click();
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        Thread.sleep(3000);
        WebElement erstPro=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        erstPro.click();
        //6. Add to Cart butonuna basin
        WebElement addCart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addCart.click();
        //7. Alisveris sepetine tiklayin
        WebElement korb= driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
        korb.click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement checkOut= driver.findElement(By.id("checkout"));
        checkOut.click();
        //9. Sayfayi kapatin
        driver.close();

    }
}
