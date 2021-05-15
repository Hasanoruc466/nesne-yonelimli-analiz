package akilliCihaz;

import java.util.Scanner;

public class Menu {
    Eyleyici e1 = new Eyleyici();
    Veritabani vt = new Veritabani.VeritabaniBuilder().build();
    Publisher p = new Publisher();
    ISicaklik s1 = new SicakilkDerece();
    ISicaklik s2 = new SicaklikKelvin();
    ISicaklik s3 = new SicaklikFahrenheit();
    SicaklikAlgilayici sa1 = new SicaklikAlgilayici(s1, p);
    SicaklikAlgilayici sa2 = new SicaklikAlgilayici(s2, p);
    SicaklikAlgilayici sa3 = new SicaklikAlgilayici(s3, p);
    int secim;
    Scanner s = new Scanner(System.in);

    public void MenuAc() {
        p.attach(vt);
        p.attach(e1);

       do {
           System.out.println();
           System.out.println("1-Sıcaklık Ölçme");
           System.out.println("2-Soğutucuyu Aç");
           System.out.println("3-Soğutucuyu Kapat");
           System.out.println("4-Çıkış");
           secim = s.nextInt();
           if(secim == 1){
               System.out.println("1-Derece olarak ölç");
               System.out.println("2-Kelvin olarak ölç");
               System.out.println("3-Fahrenheit olarak ölç");
               secim = s.nextInt();
               if(secim == 1)
                   sa1.hesapla();
               else if(secim == 2)
                   sa2.hesapla();
               else if(secim == 3)
                   sa3.hesapla();
               else
                   System.out.println("Hatalı tuşlama yaptınız...");
           }
           else if(secim == 2)
               e1.SogutucuAc();
           else if(secim == 3)
               e1.SogutucuKapat();
           else if(secim == 4) {
               System.out.println("Akıllı cihaz kapatılıyor...");
               break;
           }
           else
               System.out.println("Hatalı tuşlama yaptınız...");
       }while(secim!=4);
    }

}
