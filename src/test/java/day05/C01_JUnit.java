package day05;
import org.junit.Test;
public class C01_JUnit {
    //java daki gibi selenium da da method'lar  olusturabiliriz.
    //ancak bu methodlar cagrilmadikca calismazlar
    public void erstTestMethodu() {
        System.out.println("Erste Methodum");
    }
    //JUnit ile notasyon kullanarak siradan methodlari test methoduna donusturebiliriz
    //Bir Test method'u bagimsiz olarak calisabilen test yapmamiza imkan verir
    //@Test notasyonu sayesinde main method mecburiyeti
@Test
    public void notasyonluErstTestMethodu() {
        System.out.println("notasyonlu Erste Methodum");
    }
}