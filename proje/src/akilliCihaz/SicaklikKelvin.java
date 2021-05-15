package akilliCihaz;


import java.util.Random;

public class SicaklikKelvin implements ISicaklik{
    int deger;
    Random r = new Random();

    @Override
    public void Hesapla() {
        deger = r.nextInt(60) + 273;
        System.out.println("Sıcaklık : " + deger + " Kelvin");
    }
}
