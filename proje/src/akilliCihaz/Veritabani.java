package akilliCihaz;

import java.sql.*;

public class Veritabani implements IObserver {
    String kAdi , sif;

    private Veritabani(VeritabaniBuilder builder){
        this.kAdi = builder.kAdi;
        this.sif = builder.sif;
    }


    public static class VeritabaniBuilder{
        String kAdi, sif;
        public VeritabaniBuilder(){
            kAdi = " ";
            sif = " ";
        }

        public VeritabaniBuilder kullanici(String kAdi){
            this.kAdi = kAdi;
            return this;
        }

        public VeritabaniBuilder sifre (String sif){
            this.sif = sif;
            return this;
        }

        public Veritabani build(){
            return new Veritabani(this);
        }

    }
    @Override
    public void update() {
        System.out.println("Sıcaklık degeri veritabanına gönderildi...");
    }

    public void Giris(String kullanici, String sifre){
        Menu menu = new Menu();
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AkilliCihaz","postgres","Hasan.2901");
            if(conn!=null)
                System.out.println("Veritabanına bağlandı...");
            else
                System.out.println("Veritabanına bağlanma başarısız...");
            String sql = "SELECT * FROM \"kullanici\"";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            conn.close();
            while (rs.next()) {
                kAdi = rs.getString("kullaniciAdi");
                sif = rs.getString("sifre");
            }
            stm.close();
            rs.close();
            if (kullanici.equals(kAdi) && sifre.equals(sif)) {
                System.out.println("Giriş başarılı");
                menu.MenuAc();
            }
            else
                System.out.println("Giriş başarısız");

        } catch (SQLException trowables){
            trowables.printStackTrace();
        }

    }


}
