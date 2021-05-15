package akilliCihaz;

import java.util.Random;

public class SicakilkDerece implements ISicaklik{
    int deger;
    Random r = new Random();

    @Override
    public void Hesapla() {
        deger = r.nextInt(60);
        System.out.println("Sıcaklık : " + deger + " Derece");
    }
}
