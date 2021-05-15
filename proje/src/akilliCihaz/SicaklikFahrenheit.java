package akilliCihaz;

import java.util.Random;

public class SicaklikFahrenheit implements  ISicaklik{
    int deger;
    Random r = new Random();

    @Override
    public void Hesapla() {
        deger = r.nextInt(60) + 32;
        System.out.println("Sıcaklık : " + deger + " Fahrenheit");
    }
}
