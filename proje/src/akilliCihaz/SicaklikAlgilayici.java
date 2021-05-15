package akilliCihaz;



public class SicaklikAlgilayici {
    ISicaklik sicaklik;
    ISubject publisher;

    public SicaklikAlgilayici(ISicaklik sicaklik, ISubject publisher){
        this.sicaklik = sicaklik;
        this.publisher = publisher;
    }

    public void hesapla(){
        sicaklik.Hesapla();
        publisher.bildirim();
    }

}
