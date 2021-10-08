package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C02_Test02 {
    public static void main(String[] args) {
        //1-Test01 isimli bir class olusturun
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
    //2. Signin buttonuna tiklayin
      driver.findElement(By.id("signin_button")).click();
    //3. Login alanine  “username” yazdirin
        driver.findElement(By.id("user_login")).sendKeys("username");
    //4. Password alanine “password” yazdirin
        driver.findElement(By.id("user_password")).sendKeys("password");
    //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/input")).click();
        //7. onlinebanking sayfasina gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']"));
    //6. Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//*[@id=\"pay_bills_tab\"]/a")).click();
    //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin

    //8. tarih kismina “2020-09-10” yazdirin
    //9. Pay buttonuna tiklayin
    //10. “The payment was successfully submitted.” mesajinin ciktigini control edin

    }
}
