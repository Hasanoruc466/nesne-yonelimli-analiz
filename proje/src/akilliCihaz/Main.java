package akilliCihaz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String kullanici, sifre;
        Scanner girdi = new Scanner(System.in);
        Veritabani vt = new Veritabani.VeritabaniBuilder().build();

        System.out.println("HOŞGELDİNİZ...");
        System.out.print("Kullanici Adi: ");
        kullanici = girdi.next();
        System.out.print("Şifre: ");
        sifre = girdi.next();
        vt.Giris(kullanici, sifre);



    }
}
