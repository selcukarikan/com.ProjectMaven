package day06;

import org.junit.Test;

public class Test01 {

    // @Test yazilmadigi icin calismadi

    public void test01(){
        System.out.println("es ist erste test01");
    }
    //JUnit te notasyon kullanarak siradan methodlari test methoduna donusturebiliriz
    //Bir test methodu bagimsiz olarak calisabilen test yapmamiza imkan verir
    //Test notasyonu sayesinde main method mecburiyeti ortadan kalkar

    @Test
    public void test02(){
        System.out.println("es ist zweite test02");
    }

}
